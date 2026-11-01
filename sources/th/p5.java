package th;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.is;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class p5 implements Runnable {
    public final int f49383a;
    public final Object f49384b;
    public final long f49385c;
    public final Object d;

    public p5(Object obj, long j10, Object obj2, int i10) {
        this.f49383a = i10;
        this.f49384b = obj;
        this.f49385c = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f49383a) {
            case 0:
                ((r5) this.f49384b).l(this.f49385c, (TL_stories.StoryItem) this.d);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.d;
                long j10 = this.f49385c;
                is isVar = ((r5) this.f49384b).f49426b;
                SQLiteDatabase sQLiteDatabase = isVar.f16333b;
                try {
                    String join = TextUtils.join(", ", arrayList);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    isVar.o(th2, true);
                    return;
                }
            case 2:
                ((View) this.d).invalidate();
                wp.r1(((v5) this.f49384b).f49558a).O1().h0(this.f49385c, false);
                return;
            case 3:
                vh.r6 r6Var = (vh.r6) this.f49384b;
                r6Var.getClass();
                r6Var.e(this.f49385c, ((TLRPC.ChatFull) this.d).participants);
                return;
            default:
                ((long[]) this.f49384b)[0] = this.f49385c;
                ((i2.g1) this.d).run();
                return;
        }
    }

    public p5(Object obj, Object obj2, long j10, int i10) {
        this.f49383a = i10;
        this.f49384b = obj;
        this.d = obj2;
        this.f49385c = j10;
    }
}
