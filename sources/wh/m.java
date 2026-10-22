package wh;
public final class m implements Runnable {
    public final int f49100a;
    public final n f49101b;
    public final int f49102c;

    public m(n nVar, int i10, int i11) {
        this.f49100a = i11;
        this.f49101b = nVar;
        this.f49102c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49100a) {
            case 0:
                n nVar = this.f49101b;
                nVar.post(new m(nVar, this.f49102c, 1));
                return;
            default:
                int i10 = this.f49102c;
                n nVar2 = this.f49101b;
                if (i10 == nVar2.h) {
                    nVar2.f49106f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
