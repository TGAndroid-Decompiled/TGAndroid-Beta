package zh;

import bi.ce;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fb1;
public final class o4 implements Runnable {
    public final int f48741a;
    public final long f48742b;
    public final Object f48743c;

    public o4(Object obj, long j3, int i10) {
        this.f48741a = i10;
        this.f48743c = obj;
        this.f48742b = j3;
    }

    @Override
    public final void run() {
        switch (this.f48741a) {
            case 0:
                org.telegram.ui.ActionBar.p2 d02 = fb1.d0(MessagesController.getInstance(((i5) this.f48743c).f48499a).getChat(Long.valueOf(-this.f48742b)), true);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != 0) {
                    ce ceVar = ce.F2;
                    if (ceVar != null && ceVar.d) {
                        ?? obj = new Object();
                        obj.f18485a = true;
                        R.showAsSheet(d02, obj);
                        return;
                    }
                    R.presentFragment(d02);
                    return;
                }
                return;
            default:
                long j3 = this.f48742b;
                MessagesStorage messagesStorage = ((v5) this.f48743c).f48990b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j3).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
        }
    }
}
