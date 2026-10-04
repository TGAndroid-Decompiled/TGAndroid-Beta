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
    public final View f48345a;
    public final Layout f48346b;
    public final Stack f48347c;
    public final List d;
    public final int f48348e;
    public final int f48349f;
    public final ArrayList f48350g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f48345a = view;
        this.f48346b = layout;
        this.f48347c = stack;
        this.d = list;
        this.f48348e = i10;
        this.f48349f = i11;
        this.f48350g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f48347c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f48404y = false;
        ArrayList arrayList = this.f48350g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                bj0 bj0Var = (bj0) arrayList.get(i10);
                if (f14 >= bj0Var.f24982b && f14 <= bj0Var.f24983c) {
                    gVar.f48404y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f48394n = -1.0f;
        ValueAnimator valueAnimator = gVar.f48398r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f48396p = true;
        int max = (int) Math.max(f7, this.f48348e);
        int i11 = (int) f10;
        int i12 = this.f48349f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f48346b.getPaint().getColor());
        gVar.f48400t = nt.f29061c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = q.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f48385c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f48345a;
        if (view != null) {
            gVar.f48389i = view;
        }
        this.d.add(gVar);
    }
}
