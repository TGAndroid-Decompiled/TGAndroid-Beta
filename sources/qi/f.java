package qi;

import org.telegram.messenger.AndroidUtilities;
public final class f implements Runnable {
    public final int f44780a;
    public final i f44781b;

    public f(i iVar, int i10) {
        this.f44780a = i10;
        this.f44781b = iVar;
    }

    private final void a() {
        i iVar = this.f44781b;
        iVar.e();
        synchronized (iVar.f44787a) {
            try {
                if (iVar.f44804u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new f(iVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: qi.f.run():void");
    }
}
