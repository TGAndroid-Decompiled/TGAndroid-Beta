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
    public final View f51826a;
    public final Layout f51827b;
    public final Stack f51828c;
    public final List d;
    public final int e;
    public final int f51829f;
    public final ArrayList f51830g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f51826a = view;
        this.f51827b = layout;
        this.f51828c = stack;
        this.d = list;
        this.e = i10;
        this.f51829f = i11;
        this.f51830g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f51828c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f51880y = false;
        ArrayList arrayList = this.f51830g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                oj0 oj0Var = (oj0) arrayList.get(i10);
                if (f14 >= oj0Var.f31315b && f14 <= oj0Var.f31316c) {
                    gVar.f51880y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f51870n = -1.0f;
        ValueAnimator valueAnimator = gVar.f51874r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f51872p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f51829f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f51827b.getPaint().getColor());
        gVar.f51876t = ut.f33493c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = ee.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f51862c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f51826a;
        if (view != null) {
            gVar.f51865i = view;
        }
        this.d.add(gVar);
    }
}
