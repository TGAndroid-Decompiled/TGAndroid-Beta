package vh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.xe;
public final class m2 extends k2 {
    public final int f51490k0 = 0;
    public final Object f51491l0;

    public m2(int i10, Context context, th.b bVar, float f7, String str) {
        super(i10, context, bVar, null, true, f7, false, false);
        this.f51491l0 = str;
    }

    @Override
    public void a() {
        switch (this.f51490k0) {
            case 1:
                o8 o8Var = (o8) this.f51491l0;
                o8Var.M0.setTranslationY(o8Var.f51659n.getMeasuredHeight() - o8Var.M0.g());
                g7 g7Var = o8Var.f51671q2;
                if (g7Var != null) {
                    g7Var.run();
                    o8Var.f51671q2 = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.f51490k0) {
            case 1:
                if (((o8) this.f51491l0).f51637f0 == 0 && z10) {
                    org.telegram.messenger.i0.g3(new d0(this, 16));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f51490k0) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
                    o8 o8Var = (o8) this.f51491l0;
                    o8Var.L0 = true;
                    o8Var.e(false);
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public String getTitle() {
        switch (this.f51490k0) {
            case 0:
                return (String) this.f51491l0;
            default:
                return super.getTitle();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f51490k0) {
            case 1:
                super.setTranslationY(f7);
                o8 o8Var = (o8) this.f51491l0;
                if (o8Var.f51654k2) {
                    float i10 = Utilities.i(1.0f - (f7 / (o8Var.f51659n.getMeasuredHeight() - o8Var.M0.g())), 1.0f, 0.0f);
                    o8Var.f51672r.b(org.telegram.messenger.i0.L(-32.0f) * i10);
                    o8Var.f51672r.setAlpha(1.0f - (0.6f * i10));
                    o8Var.f51646i0.setAlpha(1.0f - i10);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public m2(o8 o8Var, int i10, Context context, th.b bVar, xe xeVar, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, xeVar, z10, 1.39f, z11, z12);
        this.f51491l0 = o8Var;
    }
}
