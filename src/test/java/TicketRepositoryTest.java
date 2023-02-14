import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.TicketManager.Ticket;
import ru.netology.repo.TicketRepository;

public class TicketRepositoryTest {
    Ticket ticket1 = new Ticket(545, 2100, "MOV", "UFA", 135);
    Ticket ticket2 = new Ticket(746, 3500, "UFA", "MOV", 120);
    Ticket ticket3 = new Ticket(193, 5000, "UFA", "LED", 180);
    Ticket ticket4 = new Ticket(394, 4000, "MOV", "UFA", 125);
    Ticket ticket5 = new Ticket(876, 2150, "MOV", "UFA", 160);
    Ticket ticket6 = new Ticket(277, 1950, "MOV", "UFA", 180);
    Ticket ticket7 = new Ticket(977, 1900, "MOV", "LED", 90);
    Ticket ticket8 = new Ticket(177, 1950, "MOV", "UFA", 180);

    @Test
    public void shouldFindAll() {
        TicketRepository repository = new TicketRepository();
        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);
        repository.add(ticket6);
        repository.add(ticket7);
        repository.add(ticket8);
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8};
        Ticket[] actual = repository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        TicketRepository repository = new TicketRepository();
        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);
        repository.add(ticket6);
        repository.add(ticket7);
        repository.add(ticket8);
        Ticket expected = ticket7;
        Ticket actual = repository.findById(977);

        Assertions.assertEquals(expected, actual);
    }

}
