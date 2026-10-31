package th;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.hs;
public final class o5 implements Runnable {
    public final int f49280a;
    public final r5 f49281b;
    public final long f49282c;
    public final int d;

    public o5(r5 r5Var, long j10, int i10, int i11) {
        this.f49280a = i11;
        this.f49281b = r5Var;
        this.f49282c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f49280a) {
            case 0:
                long j10 = this.f49282c;
                int i10 = this.d;
                hs hsVar = this.f49281b.f49412b;
                SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i10 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    hsVar.o(th2, true);
                    return;
                }
            default:
                long j11 = this.f49282c;
                int i11 = this.d;
                hs hsVar2 = this.f49281b.f49412b;
                SQLiteDatabase sQLiteDatabase2 = hsVar2.f15940b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j11 + " AND story_id = " + i11).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    hsVar2.o(th3, true);
                    return;
                }
        }
    }
}
