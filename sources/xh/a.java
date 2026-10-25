package xh;

import a8.ee;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ut;
public final class a extends Path {
    public final View f51823a;
    public final Layout f51824b;
    public final Stack f51825c;
    public final List d;
    public final int e;
    public final int f51826f;
    public final ArrayList f51827g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f51823a = view;
        this.f51824b = layout;
        this.f51825c = stack;
        this.d = list;
        this.e = i10;
        this.f51826f = i11;
        this.f51827g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f51825c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f51877y = false;
        ArrayList arrayList = this.f51827g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                oj0 oj0Var = (oj0) arrayList.get(i10);
                if (f14 >= oj0Var.f31313b && f14 <= oj0Var.f31314c) {
                    gVar.f51877y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f51867n = -1.0f;
        ValueAnimator valueAnimator = gVar.f51871r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f51869p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f51826f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f51824b.getPaint().getColor());
        gVar.f51873t = ut.f33490c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = ee.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f51859c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f51823a;
        if (view != null) {
            gVar.f51862i = view;
        }
        this.d.add(gVar);
    }
}
