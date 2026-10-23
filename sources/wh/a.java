package wh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.st;
import w7.r;
public final class a extends Path {
    public final View f49022a;
    public final Layout f49023b;
    public final Stack f49024c;
    public final List d;
    public final int e;
    public final int f49025f;
    public final ArrayList f49026g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f49022a = view;
        this.f49023b = layout;
        this.f49024c = stack;
        this.d = list;
        this.e = i10;
        this.f49025f = i11;
        this.f49026g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f49024c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f49076y = false;
        ArrayList arrayList = this.f49026g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                mj0 mj0Var = (mj0) arrayList.get(i10);
                if (f14 >= mj0Var.f28538b && f14 <= mj0Var.f28539c) {
                    gVar.f49076y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f49066n = -1.0f;
        ValueAnimator valueAnimator = gVar.f49070r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f49068p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f49025f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f49023b.getPaint().getColor());
        gVar.f49072t = st.f30360c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = r.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f49058c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f49022a;
        if (view != null) {
            gVar.f49061i = view;
        }
        this.d.add(gVar);
    }
}
