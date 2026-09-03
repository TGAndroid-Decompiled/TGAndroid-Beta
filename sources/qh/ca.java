package qh;
public final class ca implements Runnable {
    public final int f45198a;
    public final la f45199b;

    public ca(la laVar, int i10) {
        this.f45198a = i10;
        this.f45199b = laVar;
    }

    @Override
    public final void run() {
        switch (this.f45198a) {
            case 0:
                la laVar = this.f45199b;
                ja jaVar = laVar.J;
                if (jaVar != null) {
                    long j10 = jaVar.f45553a;
                    if (j10 > 0) {
                        laVar.E = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fa faVar = this.f45199b.f45661a;
                if (faVar != null) {
                    faVar.w0();
                    return;
                }
                return;
            default:
                fa faVar2 = this.f45199b.f45661a;
                if (faVar2 != null) {
                    faVar2.G();
                    return;
                }
                return;
        }
    }
}
