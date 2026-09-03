package wh;

import org.telegram.messenger.voip.GroupCallMessage;
public final class v1 implements Runnable {
    public final int f50130a;
    public final Object f50131b;

    public v1(Object obj, int i10) {
        this.f50130a = i10;
        this.f50131b = obj;
    }

    @Override
    public final void run() {
        switch (this.f50130a) {
            case 0:
                ((w1) this.f50131b).invalidateSelf();
                return;
            case 1:
                ((d2) this.f50131b).c();
                return;
            case 2:
                ((yg.b) this.f50131b).invalidate();
                return;
            default:
                zg.c cVar = (zg.c) this.f50131b;
                GroupCallMessage groupCallMessage = cVar.E;
                if (groupCallMessage != null) {
                    cVar.f51212a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f51213b.a(cVar.E.isSendError(), true);
                    return;
                }
                return;
        }
    }
}
