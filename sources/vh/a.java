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
import org.telegram.ui.Components.nt;
import w7.q;
public final class a extends Path {
    public final View f48344a;
    public final Layout f48345b;
    public final Stack f48346c;
    public final List d;
    public final int f48347e;
    public final int f48348f;
    public final ArrayList f48349g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f48344a = view;
        this.f48345b = layout;
        this.f48346c = stack;
        this.d = list;
        this.f48347e = i10;
        this.f48348f = i11;
        this.f48349g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f48346c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f48403y = false;
        ArrayList arrayList = this.f48349g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                bj0 bj0Var = (bj0) arrayList.get(i10);
                if (f14 >= bj0Var.f24981b && f14 <= bj0Var.f24982c) {
                    gVar.f48403y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f48393n = -1.0f;
        ValueAnimator valueAnimator = gVar.f48397r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f48395p = true;
        int max = (int) Math.max(f7, this.f48347e);
        int i11 = (int) f10;
        int i12 = this.f48348f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f48345b.getPaint().getColor());
        gVar.f48399t = nt.f29060c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = q.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f48384c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f48344a;
        if (view != null) {
            gVar.f48388i = view;
        }
        this.d.add(gVar);
    }
}
