import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.TicketManager.Ticket;
import ru.netology.TicketManager.TicketManager;
import ru.netology.repo.TicketRepository;

public class TicketManagerTest {

    @Test
    public void testShouldSortTickets() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(545, 2100, "MOV", "UFA", 135);
        Ticket ticket2 = new Ticket(746, 3500, "UFA", "MOV", 120);
        Ticket ticket3 = new Ticket(193, 5000, "UFA", "LED", 180);
        Ticket ticket4 = new Ticket(394, 4000, "MOV", "UFA", 125);
        Ticket ticket5 = new Ticket(876, 2150, "MOV", "UFA", 160);
        Ticket ticket6 = new Ticket(277, 1950, "MOV", "UFA", 180);
        Ticket ticket7 = new Ticket(977, 1900, "MOV", "LED", 90);
        Ticket ticket8 = new Ticket(177, 1950, "MOV", "UFA", 180);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[]expected = {ticket6,ticket8,ticket1,ticket5, ticket4};
        Ticket[] actual = manager.findAll("MOV", "UFA");

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testShouldFindIfToWrong() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(545, 2100, "MOV", "UFA", 135);
        Ticket ticket2 = new Ticket(746, 3500, "UFA", "MOV", 120);
        Ticket ticket3 = new Ticket(193, 5000, "UFA", "LED", 180);
        Ticket ticket4 = new Ticket(394, 4000, "MOV", "UFA", 125);
        Ticket ticket5 = new Ticket(876, 2150, "MOV", "UFA", 160);
        Ticket ticket6 = new Ticket(277, 1950, "MOV", "UFA", 180);
        Ticket ticket7 = new Ticket(977, 1900, "MOV", "LED", 90);
        Ticket ticket8 = new Ticket(177, 1950, "MOV", "UFA", 180);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[]expected = {};
        Ticket[] actual = manager.findAll("MOV", "KZN");

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testShouldFindIfFromWrong() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(545, 2100, "MOV", "UFA", 135);
        Ticket ticket2 = new Ticket(746, 3500, "UFA", "MOV", 120);
        Ticket ticket3 = new Ticket(193, 5000, "UFA", "LED", 180);
        Ticket ticket4 = new Ticket(394, 4000, "MOV", "UFA", 125);
        Ticket ticket5 = new Ticket(876, 2150, "MOV", "UFA", 160);
        Ticket ticket6 = new Ticket(277, 1950, "MOV", "UFA", 180);
        Ticket ticket7 = new Ticket(977, 1900, "MOV", "LED", 90);
        Ticket ticket8 = new Ticket(177, 1950, "MOV", "UFA", 180);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[]expected = {};
        Ticket[] actual = manager.findAll("KZN","MOV");

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testShouldFindIfThereIsOnlyOneDirection() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(545, 2100, "MOV", "UFA", 135);
        Ticket ticket2 = new Ticket(746, 3500, "UFA", "MOV", 120);
        Ticket ticket3 = new Ticket(193, 5000, "UFA", "LED", 180);
        Ticket ticket4 = new Ticket(394, 4000, "MOV", "UFA", 125);
        Ticket ticket5 = new Ticket(876, 2150, "MOV", "UFA", 160);
        Ticket ticket6 = new Ticket(277, 1950, "MOV", "UFA", 180);
        Ticket ticket7 = new Ticket(977, 1900, "MOV", "LED", 90);
        Ticket ticket8 = new Ticket(177, 1950, "MOV", "UFA", 180);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[]expected = {ticket3};
        Ticket[] actual = manager.findAll("UFA","LED");

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testShouldFindIfEmptyStringFrom() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(545, 2100, "MOV", "UFA", 135);
        Ticket ticket2 = new Ticket(746, 3500, "UFA", "MOV", 120);
        Ticket ticket3 = new Ticket(193, 5000, "UFA", "LED", 180);
        Ticket ticket4 = new Ticket(394, 4000, "MOV", "UFA", 125);
        Ticket ticket5 = new Ticket(876, 2150, "MOV", "UFA", 160);
        Ticket ticket6 = new Ticket(277, 1950, "MOV", "UFA", 180);
        Ticket ticket7 = new Ticket(977, 1900, "MOV", "LED", 90);
        Ticket ticket8 = new Ticket(177, 1950, "MOV", "UFA", 180);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[]expected = {};
        Ticket[] actual = manager.findAll("","MOV");

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testShouldFindIfEmptyStringTo() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);
        Ticket ticket1 = new Ticket(545, 2100, "MOV", "UFA", 135);
        Ticket ticket2 = new Ticket(746, 3500, "UFA", "MOV", 120);
        Ticket ticket3 = new Ticket(193, 5000, "UFA", "LED", 180);
        Ticket ticket4 = new Ticket(394, 4000, "MOV", "UFA", 125);
        Ticket ticket5 = new Ticket(876, 2150, "MOV", "UFA", 160);
        Ticket ticket6 = new Ticket(277, 1950, "MOV", "UFA", 180);
        Ticket ticket7 = new Ticket(977, 1900, "MOV", "LED", 90);
        Ticket ticket8 = new Ticket(177, 1950, "MOV", "UFA", 180);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[]expected = {};
        Ticket[] actual = manager.findAll("MOV","");

        Assertions.assertArrayEquals(expected,actual);
    }
}
