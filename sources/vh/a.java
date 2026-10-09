package vh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.tj0;
import w7.o;
public final class a extends Path {
    public final View f49642a;
    public final Layout f49643b;
    public final Stack f49644c;
    public final List d;
    public final int f49645e;
    public final int f49646f;
    public final ArrayList f49647g;

    public a(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f49642a = view;
        this.f49643b = layout;
        this.f49644c = stack;
        this.d = list;
        this.f49645e = i10;
        this.f49646f = i11;
        this.f49647g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        g gVar;
        float f13;
        Stack stack = this.f49644c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            gVar = (g) stack.remove(0);
        } else {
            gVar = new g();
        }
        gVar.f49701y = false;
        ArrayList arrayList = this.f49647g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                tj0 tj0Var = (tj0) arrayList.get(i10);
                if (f14 >= tj0Var.f31211b && f14 <= tj0Var.f31212c) {
                    gVar.f49701y = true;
                    break;
                }
                i10++;
            }
        }
        gVar.f49691n = -1.0f;
        ValueAnimator valueAnimator = gVar.f49695r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gVar.f49693p = true;
        int max = (int) Math.max(f7, this.f49645e);
        int i11 = (int) f10;
        int i12 = this.f49646f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        gVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        gVar.h(this.f49643b.getPaint().getColor());
        gVar.f49697t = au.f24774c;
        int width = gVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = g.B;
        int b10 = o.b(width * i13, i13, g.A);
        Stack stack2 = gVar.f49682c;
        gVar.d = b10;
        while (gVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f49642a;
        if (view != null) {
            gVar.f49686i = view;
        }
        this.d.add(gVar);
    }
}
