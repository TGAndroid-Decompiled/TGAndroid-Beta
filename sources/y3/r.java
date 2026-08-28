package y3;

import d5.f0;
public final class r implements v {
    public static final r f49550b = new r(0);
    public final int f49551a;

    public r(int i9) {
        this.f49551a = i9;
    }

    @Override
    public int b(Object obj) {
        n nVar = (n) obj;
        switch (this.f49551a) {
            case 2:
                String str = nVar.f49505a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (f0.f4349a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                return nVar.f49505a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
