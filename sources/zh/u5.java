package zh;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesStorage;
public final class u5 implements Runnable {
    public final int f48909a;
    public final v5 f48910b;
    public final long f48911c;
    public final int d;

    public u5(v5 v5Var, long j3, int i10, int i11) {
        this.f48909a = i11;
        this.f48910b = v5Var;
        this.f48911c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f48909a) {
            case 0:
                long j3 = this.f48911c;
                int i10 = this.d;
                MessagesStorage messagesStorage = this.f48910b.f48990b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j3 + " AND story_id = " + i10).stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            default:
                long j10 = this.f48911c;
                int i11 = this.d;
                MessagesStorage messagesStorage2 = this.f48910b.f48990b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                try {
                    Locale locale2 = Locale.US;
                    database2.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i11 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    messagesStorage2.checkSQLException(th3);
                    return;
                }
        }
    }
}
