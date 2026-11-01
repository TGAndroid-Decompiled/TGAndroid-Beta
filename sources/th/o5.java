package th;

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.is;
public final class o5 implements Runnable {
    public final int f49294a;
    public final r5 f49295b;
    public final long f49296c;
    public final int d;

    public o5(r5 r5Var, long j10, int i10, int i11) {
        this.f49294a = i11;
        this.f49295b = r5Var;
        this.f49296c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f49294a) {
            case 0:
                long j10 = this.f49296c;
                int i10 = this.d;
                is isVar = this.f49295b.f49426b;
                SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("REPLACE INTO stories_counter VALUES(" + j10 + ", 0, " + i10 + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    isVar.o(th2, true);
                    return;
                }
            default:
                long j11 = this.f49296c;
                int i11 = this.d;
                is isVar2 = this.f49295b.f49426b;
                SQLiteDatabase sQLiteDatabase2 = isVar2.f16333b;
                try {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("DELETE FROM stories WHERE dialog_id = " + j11 + " AND story_id = " + i11).stepThis().dispose();
                    return;
                } catch (Throwable th3) {
                    isVar2.o(th3, true);
                    return;
                }
        }
    }
}
