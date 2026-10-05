package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.w9;
import org.telegram.ui.cg0;
import w7.z5;
public final class g extends FrameLayout {
    public final w9 f46123a;
    public final s20 f46124b;
    public final int f46125c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        s20 s20Var = new s20();
        this.f46124b = s20Var;
        int i10 = jVar.f46145f;
        d6 d6Var = jVar.f46064a;
        if (i10 == 0) {
            this.f46125c = AndroidUtilities.dp(150.0f);
            w9 w9Var = new w9(context);
            this.f46123a = w9Var;
            w9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(w9Var, z5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            h9 h9Var = new h9((d6) null);
            h9Var.r(currentUser);
            w9Var.getImageReceiver().setForUserOrChat(currentUser, h9Var);
            TextView textView = new TextView(context);
            e2.l(20.0f, 1, textView);
            textView.setTextColor(i6.v0(i6.G6, d6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, z5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            s20Var.f30668m = true;
            s20Var.f30658a = true;
            s20Var.d(i6.w0(null, i6.Mj, false), i6.w0(null, i6.Lj, false), 0, 0);
            s20Var.f30660c.setStyle(Paint.Style.STROKE);
            s20Var.f30660c.setStrokeCap(Paint.Cap.ROUND);
            s20Var.f30660c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            ei.g gVar = new ei.g(context, 4);
            addView(gVar, z5.e(-1, 190, 55));
            cg0 cg0Var = new cg0(context, 1, 1, 1);
            cg0Var.setStarParticlesView(gVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = i6.Mj;
            canvas.drawColor(i0.a.d(0.5f, i6.v0(i11, d6Var), i6.v0(i6.f20899h5, d6Var)));
            cg0Var.setBackgroundBitmap(createBitmap);
            sg.a aVar = cg0Var.f46827b;
            aVar.f46815w = i11;
            aVar.f46816x = i6.Lj;
            aVar.b();
            addView(cg0Var, z5.e(160, 160, 1));
            cg0Var.j(100L);
            TextView f7 = org.telegram.messenger.q.f(context, 1, 20.0f);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextColor(i6.v0(i6.G6, d6Var));
            bi.k(R.string.TelegramBusiness, f7, 17);
            addView(f7, z5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(i6.v0(i6.f21233z6, d6Var));
            bi.k(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, z5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f46145f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f46123a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            s20 s20Var = this.f46124b;
            s20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, s20Var.f30660c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f46125c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
