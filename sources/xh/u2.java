package xh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class u2 implements Comparator {
    public final int f51624a;
    public final i4 f51625b;

    public u2(i4 i4Var, int i10) {
        this.f51624a = i10;
        this.f51625b = i4Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f51624a) {
            case 0:
                v3 v3Var = this.f51625b.d;
                Integer num = (Integer) v3Var.f51651o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f20038id));
                Integer num2 = (Integer) v3Var.f51651o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f20038id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                v3 v3Var2 = this.f51625b.d;
                Integer num3 = (Integer) v3Var2.f51650n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) v3Var2.f51650n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                v3 v3Var3 = this.f51625b.d;
                Integer num5 = (Integer) v3Var3.f51649m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f20038id));
                Integer num6 = (Integer) v3Var3.f51649m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f20038id));
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
