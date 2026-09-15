package vh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.oi0;
import w7.p;
public final class a extends Path {
    public final View f44369a;
    public final Layout f44370b;
    public final Stack f44371c;
    public final List d;
    public final int e;
    public final int f44372f;
    public final ArrayList f44373g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f44369a = view;
        this.f44370b = layout;
        this.f44371c = stack;
        this.d = list;
        this.e = i10;
        this.f44372f = i11;
        this.f44373g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        h hVar;
        float f13;
        Stack stack = this.f44371c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            hVar = (h) stack.remove(0);
        } else {
            hVar = new h();
        }
        hVar.f44424y = false;
        ArrayList arrayList = this.f44373g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                oi0 oi0Var = (oi0) arrayList.get(i10);
                if (f14 >= oi0Var.f26810b && f14 <= oi0Var.f26811c) {
                    hVar.f44424y = true;
                    break;
                }
                i10++;
            }
        }
        hVar.f44414n = -1.0f;
        ValueAnimator valueAnimator = hVar.f44418r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        hVar.f44416p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f44372f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        hVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        hVar.h(this.f44370b.getPaint().getColor());
        hVar.f44420t = kt.f25679c;
        int width = hVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = h.B;
        int b10 = p.b(width * i13, i13, h.A);
        Stack stack2 = hVar.f44406c;
        hVar.d = b10;
        while (hVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f44369a;
        if (view != null) {
            hVar.f44409i = view;
        }
        this.d.add(hVar);
    }
}
