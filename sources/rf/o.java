package rf;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.Components.mn0;
public final class o implements Runnable {
    public final int f47324a;
    public final a0 f47325b;
    public final long f47326c;

    public o(mn0 mn0Var, long j10, int i10) {
        this.f47324a = i10;
        this.f47325b = mn0Var;
        this.f47326c = j10;
    }

    @Override
    public final void run() {
        switch (this.f47324a) {
            case 0:
                long j10 = this.f47326c;
                a0 a0Var = this.f47325b;
                a0Var.getClass();
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(a0Var.f47155o0).getDatabase();
                    database.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                long j11 = this.f47326c;
                a0 a0Var2 = this.f47325b;
                a0Var2.getClass();
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(a0Var2.f47155o0).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
