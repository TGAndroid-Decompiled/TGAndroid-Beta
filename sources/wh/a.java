package wh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.oi0;
public final class a extends Path {
    public final View f48575a;
    public final Layout f48576b;
    public final Stack f48577c;
    public final List d;
    public final int f48578e;
    public final int f48579f;
    public final ArrayList f48580g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f48575a = view;
        this.f48576b = layout;
        this.f48577c = stack;
        this.d = list;
        this.f48578e = i10;
        this.f48579f = i11;
        this.f48580g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        h hVar;
        float f13;
        Stack stack = this.f48577c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            hVar = (h) stack.remove(0);
        } else {
            hVar = new h();
        }
        hVar.f48635y = false;
        ArrayList arrayList = this.f48580g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                oi0 oi0Var = (oi0) arrayList.get(i10);
                if (f14 >= oi0Var.f29078b && f14 <= oi0Var.f29079c) {
                    hVar.f48635y = true;
                    break;
                }
                i10++;
            }
        }
        hVar.f48625n = -1.0f;
        ValueAnimator valueAnimator = hVar.f48629r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        hVar.f48627p = true;
        int max = (int) Math.max(f7, this.f48578e);
        int i11 = (int) f10;
        int i12 = this.f48579f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        hVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        hVar.h(this.f48576b.getPaint().getColor());
        hVar.f48631t = jt.f27568c;
        int width = hVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = h.B;
        int b10 = w7.p.b(width * i13, i13, h.A);
        Stack stack2 = hVar.f48616c;
        hVar.d = b10;
        while (hVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f48575a;
        if (view != null) {
            hVar.f48620i = view;
        }
        this.d.add(hVar);
    }
}
