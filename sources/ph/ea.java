package ph;
public final class ea implements Runnable {
    public final int f41591a;
    public final oa f41592b;

    public ea(oa oaVar, int i10) {
        this.f41591a = i10;
        this.f41592b = oaVar;
    }

    @Override
    public final void run() {
        switch (this.f41591a) {
            case 0:
                oa oaVar = this.f41592b;
                ma maVar = oaVar.J;
                if (maVar != null) {
                    long j10 = maVar.f41976a;
                    if (j10 > 0) {
                        oaVar.E = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ia iaVar = this.f41592b.f42071a;
                if (iaVar != null) {
                    iaVar.w0();
                    return;
                }
                return;
            default:
                ia iaVar2 = this.f41592b.f42071a;
                if (iaVar2 != null) {
                    iaVar2.H();
                    return;
                }
                return;
        }
    }
}
