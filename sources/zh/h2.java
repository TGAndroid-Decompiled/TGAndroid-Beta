package zh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class h2 implements Comparator {
    public final int f60233a;
    public final m3 f60234b;

    public h2(m3 m3Var, int i7) {
        this.f60233a = i7;
        this.f60234b = m3Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f60233a) {
            case 0:
                d3 d3Var = this.f60234b.d;
                Integer num = (Integer) d3Var.f60160o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f26958id));
                Integer num2 = (Integer) d3Var.f60160o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f26958id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                d3 d3Var2 = this.f60234b.d;
                Integer num3 = (Integer) d3Var2.f60159n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) d3Var2.f60159n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                d3 d3Var3 = this.f60234b.d;
                Integer num5 = (Integer) d3Var3.f60158m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f26958id));
                Integer num6 = (Integer) d3Var3.f60158m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f26958id));
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
