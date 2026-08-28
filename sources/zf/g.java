package zf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z10;
import org.telegram.ui.Components.z8;
public final class g extends FrameLayout {
    public final o9 f50508a;
    public final z10 f50509b;
    public final int f50510c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        z10 z10Var = new z10();
        this.f50509b = z10Var;
        int i9 = jVar.f50531f;
        b6 b6Var = jVar.f50463a;
        if (i9 == 0) {
            this.f50510c = AndroidUtilities.dp(150.0f);
            o9 o9Var = new o9(context);
            this.f50508a = o9Var;
            o9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(o9Var, e6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            z8 z8Var = new z8((b6) null);
            z8Var.r(currentUser);
            o9Var.getImageReceiver().setForUserOrChat(currentUser, z8Var);
            TextView textView = new TextView(context);
            j3.r0.u(20.0f, 1, textView);
            textView.setTextColor(f6.v0(f6.G6, b6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, e6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            z10Var.f35163m = true;
            z10Var.f35153a = true;
            z10Var.d(f6.w0(null, f6.Mj, false), f6.w0(null, f6.Lj, false), 0, 0);
            z10Var.f35155c.setStyle(Paint.Style.STROKE);
            z10Var.f35155c.setStrokeCap(Paint.Cap.ROUND);
            z10Var.f35155c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i9 == 1) {
            mh.f fVar = new mh.f(context, 4);
            addView(fVar, e6.e(-1, 190, 55));
            dg.q qVar = new dg.q(context, 1, 1, 3);
            qVar.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i10 = f6.Mj;
            canvas.drawColor(i0.a.d(0.5f, f6.v0(i10, b6Var), f6.v0(f6.f23072h5, b6Var)));
            qVar.setBackgroundBitmap(createBitmap);
            ag.a aVar = qVar.f205b;
            aVar.f181w = i10;
            aVar.f182x = f6.Lj;
            aVar.b();
            addView(qVar, e6.e(160, 160, 1));
            qVar.j(100L);
            TextView g10 = org.telegram.messenger.l0.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(f6.v0(f6.G6, b6Var));
            ll.l(R.string.TelegramBusiness, g10, 17);
            addView(g10, e6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(f6.v0(f6.f23386z6, b6Var));
            ll.l(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, e6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f50531f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f50508a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            z10 z10Var = this.f50509b;
            z10Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i9 = 0; i9 < 7; i9++) {
                float f11 = (i9 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(AndroidUtilities.rectTmp, f13, ((f11 + f10) - f12) - f13, false, z10Var.f35155c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11 = this.f50510c;
        if (i11 > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i9, i10);
    }
}
