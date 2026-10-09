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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.eg0;
import w7.x5;
public final class g extends FrameLayout {
    public final y9 f47250a;
    public final f30 f47251b;
    public final int f47252c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        f30 f30Var = new f30();
        this.f47251b = f30Var;
        int i10 = jVar.f47271f;
        e6 e6Var = jVar.f47199a;
        if (i10 == 0) {
            this.f47252c = AndroidUtilities.dp(150.0f);
            y9 y9Var = new y9(context);
            this.f47250a = y9Var;
            y9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(y9Var, x5.a(65.0f, 0.0f, 32.0f, 0.0f, 0.0f, 65, 1));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            j9 j9Var = new j9((e6) null);
            j9Var.r(currentUser);
            y9Var.getImageReceiver().setForUserOrChat(currentUser, j9Var);
            TextView textView = new TextView(context);
            e2.l(20.0f, 1, textView);
            textView.setTextColor(i6.w0(i6.G6, e6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, x5.a(-2.0f, 0.0f, 111.0f, 0.0f, 0.0f, -2, 1));
            f30Var.f26233m = true;
            f30Var.f26223a = true;
            f30Var.d(i6.x0(null, i6.Mj, false), i6.x0(null, i6.Lj, false), 0, 0);
            f30Var.f26225c.setStyle(Paint.Style.STROKE);
            f30Var.f26225c.setStrokeCap(Paint.Cap.ROUND);
            f30Var.f26225c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            ei.f fVar = new ei.f(context, 4);
            addView(fVar, x5.e(-1, 190, 55));
            eg0 eg0Var = new eg0(context, 1, 1, 1);
            eg0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = i6.Mj;
            canvas.drawColor(i0.a.d(0.5f, i6.w0(i11, e6Var), i6.w0(i6.f20868h5, e6Var)));
            eg0Var.setBackgroundBitmap(createBitmap);
            sg.g gVar = eg0Var.f48076b;
            gVar.f48060z = i11;
            gVar.A = i6.Lj;
            gVar.b();
            addView(eg0Var, x5.e(160, 160, 1));
            eg0Var.m(100L);
            TextView f7 = org.telegram.messenger.q.f(context, 1, 20.0f);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextColor(i6.w0(i6.G6, e6Var));
            bi.m(R.string.TelegramBusiness, f7, 17);
            addView(f7, x5.a(-2.0f, 33.0f, 150.0f, 33.0f, 0.0f, -2, 1));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(i6.w0(i6.f21199z6, e6Var));
            bi.m(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, x5.a(-2.0f, 33.0f, 183.0f, 33.0f, 20.0f, -2, 1));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f47271f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f47250a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            f30 f30Var = this.f47251b;
            f30Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, f30Var.f26225c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f47252c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
