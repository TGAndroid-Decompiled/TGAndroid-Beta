package qi;

import org.telegram.messenger.AndroidUtilities;
public final class f implements Runnable {
    public final int f45178a;
    public final i f45179b;

    public f(i iVar, int i10) {
        this.f45178a = i10;
        this.f45179b = iVar;
    }

    private final void a() {
        i iVar = this.f45179b;
        iVar.e();
        synchronized (iVar.f45185a) {
            try {
                if (iVar.f45202u) {
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
