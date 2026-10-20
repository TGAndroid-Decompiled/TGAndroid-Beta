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
    public final View f49018a;
    public final Layout f49019b;
    public final Stack f49020c;
    public final List d;
    public final int e;
    public final int f49021f;
    public final ArrayList f49022g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f49018a = view;
        this.f49019b = layout;
        this.f49020c = stack;
        this.d = list;
        this.e = i10;
        this.f49021f = i11;
        this.f49022g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f49020c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f49072y = false;
        ArrayList arrayList = this.f49022g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                mj0 mj0Var = (mj0) arrayList.get(i10);
                if (f14 >= mj0Var.f28533b && f14 <= mj0Var.f28534c) {
                    gVar.f49072y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f49062n = -1.0f;
        ValueAnimator valueAnimator = gVar.f49066r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f49064p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f49021f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f49019b.getPaint().getColor());
        gVar.f49068t = st.f30355c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = r.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f49054c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f49018a;
        if (view != null) {
            gVar.f49057i = view;
        }
        this.d.add(gVar);
    }
}
