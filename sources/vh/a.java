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
    public final View f48353a;
    public final Layout f48354b;
    public final Stack f48355c;
    public final List d;
    public final int f48356e;
    public final int f48357f;
    public final ArrayList f48358g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f48353a = view;
        this.f48354b = layout;
        this.f48355c = stack;
        this.d = list;
        this.f48356e = i10;
        this.f48357f = i11;
        this.f48358g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f48355c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f48412y = false;
        ArrayList arrayList = this.f48358g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                bj0 bj0Var = (bj0) arrayList.get(i10);
                if (f14 >= bj0Var.f24986b && f14 <= bj0Var.f24987c) {
                    gVar.f48412y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f48402n = -1.0f;
        ValueAnimator valueAnimator = gVar.f48406r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f48404p = true;
        int max = (int) Math.max(f7, this.f48356e);
        int i11 = (int) f10;
        int i12 = this.f48357f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f48354b.getPaint().getColor());
        gVar.f48408t = nt.f29066c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = q.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f48393c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f48353a;
        if (view != null) {
            gVar.f48397i = view;
        }
        this.d.add(gVar);
    }
}
