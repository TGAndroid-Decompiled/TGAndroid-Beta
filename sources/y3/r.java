package y3;

import d5.g0;

public final class r implements v {

    public static final r f49540b = new r(0);

    public final int f49541a;

    public r(int i10) {
        this.f49541a = i10;
    }

    @Override
    public int b(Object obj) {
        n nVar = (n) obj;
        switch (this.f49541a) {
            case 2:
                String str = nVar.f49495a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (g0.f4795a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return nVar.f49495a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
