package yh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class r2 implements Comparator {
    public final int f50484a;
    public final g4 f50485b;

    public r2(g4 g4Var, int i10) {
        this.f50484a = i10;
        this.f50485b = g4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f50484a) {
            case 0:
                s3 s3Var = this.f50485b.d;
                Integer num = (Integer) s3Var.f50509o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f20278id));
                Integer num2 = (Integer) s3Var.f50509o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f20278id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                s3 s3Var2 = this.f50485b.d;
                Integer num3 = (Integer) s3Var2.f50508n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) s3Var2.f50508n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                s3 s3Var3 = this.f50485b.d;
                Integer num5 = (Integer) s3Var3.f50507m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f20278id));
                Integer num6 = (Integer) s3Var3.f50507m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f20278id));
                if (num5 == null) {
                    return 1;
                }
                if (num6 == null) {
                    return -1;
                }
                return num6.intValue() - num5.intValue();
        }
    }
}
