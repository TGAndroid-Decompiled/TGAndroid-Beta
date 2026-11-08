package zh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class f2 implements Comparator {
    public final int f60319a;
    public final l3 f60320b;

    public f2(l3 l3Var, int i7) {
        this.f60319a = i7;
        this.f60320b = l3Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f60319a) {
            case 0:
                b3 b3Var = this.f60320b.d;
                Integer num = (Integer) b3Var.f60246o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26962id));
                Integer num2 = (Integer) b3Var.f60246o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26962id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                b3 b3Var2 = this.f60320b.d;
                Integer num3 = (Integer) b3Var2.f60245n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) b3Var2.f60245n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                b3 b3Var3 = this.f60320b.d;
                Integer num5 = (Integer) b3Var3.f60244m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26962id));
                Integer num6 = (Integer) b3Var3.f60244m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26962id));
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
