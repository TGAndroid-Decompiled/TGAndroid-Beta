package ph;
public final class ea implements Runnable {
    public final int f41631a;
    public final oa f41632b;

    public ea(oa oaVar, int i10) {
        this.f41631a = i10;
        this.f41632b = oaVar;
    }

    @Override
    public final void run() {
        switch (this.f41631a) {
            case 0:
                oa oaVar = this.f41632b;
                ma maVar = oaVar.J;
                if (maVar != null) {
                    long j10 = maVar.f42015a;
                    if (j10 > 0) {
                        oaVar.E = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ia iaVar = this.f41632b.f42119a;
                if (iaVar != null) {
                    iaVar.C1();
                    return;
                }
                return;
            default:
                ia iaVar2 = this.f41632b.f42119a;
                if (iaVar2 != null) {
                    iaVar2.b0();
                    return;
                }
                return;
        }
    }
}
