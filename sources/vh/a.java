package vh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.mt;
import w7.q;
public final class a extends Path {
    public final View f44652a;
    public final Layout f44653b;
    public final Stack f44654c;
    public final List d;
    public final int e;
    public final int f44655f;
    public final ArrayList f44656g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f44652a = view;
        this.f44653b = layout;
        this.f44654c = stack;
        this.d = list;
        this.e = i10;
        this.f44655f = i11;
        this.f44656g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f44654c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f44706y = false;
        ArrayList arrayList = this.f44656g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                bj0 bj0Var = (bj0) arrayList.get(i10);
                if (f14 >= bj0Var.f23004b && f14 <= bj0Var.f23005c) {
                    gVar.f44706y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f44696n = -1.0f;
        ValueAnimator valueAnimator = gVar.f44700r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f44698p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f44655f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f44653b.getPaint().getColor());
        gVar.f44702t = mt.f26495c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = q.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f44688c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f44652a;
        if (view != null) {
            gVar.f44691i = view;
        }
        this.d.add(gVar);
    }
}
