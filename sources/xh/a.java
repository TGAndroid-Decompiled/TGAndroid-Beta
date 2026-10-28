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
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ut;
public final class a extends Path {
    public final View f51884a;
    public final Layout f51885b;
    public final Stack f51886c;
    public final List d;
    public final int e;
    public final int f51887f;
    public final ArrayList f51888g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f51884a = view;
        this.f51885b = layout;
        this.f51886c = stack;
        this.d = list;
        this.e = i10;
        this.f51887f = i11;
        this.f51888g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f51886c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f51938y = false;
        ArrayList arrayList = this.f51888g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                pj0 pj0Var = (pj0) arrayList.get(i10);
                if (f14 >= pj0Var.f31630b && f14 <= pj0Var.f31631c) {
                    gVar.f51938y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f51928n = -1.0f;
        ValueAnimator valueAnimator = gVar.f51932r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f51930p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f51887f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f51885b.getPaint().getColor());
        gVar.f51934t = ut.f33458c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = ee.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f51920c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f51884a;
        if (view != null) {
            gVar.f51923i = view;
        }
        this.d.add(gVar);
    }
}
