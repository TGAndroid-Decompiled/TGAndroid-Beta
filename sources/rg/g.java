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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.w9;
import org.telegram.ui.yf0;
import w7.y5;
public final class g extends FrameLayout {
    public final w9 f42578a;
    public final r20 f42579b;
    public final int f42580c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        r20 r20Var = new r20();
        this.f42579b = r20Var;
        int i10 = jVar.f42595f;
        d6 d6Var = jVar.f42538a;
        if (i10 == 0) {
            this.f42580c = AndroidUtilities.dp(150.0f);
            w9 w9Var = new w9(context);
            this.f42578a = w9Var;
            w9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(w9Var, y5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            h9 h9Var = new h9((d6) null);
            h9Var.r(currentUser);
            w9Var.getImageReceiver().setForUserOrChat(currentUser, h9Var);
            TextView textView = new TextView(context);
            e2.l(20.0f, 1, textView);
            textView.setTextColor(h6.v0(h6.G6, d6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, y5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            r20Var.f27890m = true;
            r20Var.f27881a = true;
            r20Var.d(h6.w0(null, h6.Mj, false), h6.w0(null, h6.Lj, false), 0, 0);
            r20Var.f27883c.setStyle(Paint.Style.STROKE);
            r20Var.f27883c.setStrokeCap(Paint.Cap.ROUND);
            r20Var.f27883c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            ei.f fVar = new ei.f(context, 4);
            addView(fVar, y5.e(-1, 190, 55));
            yf0 yf0Var = new yf0(context, 1, 1, 1);
            yf0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = h6.Mj;
            canvas.drawColor(i0.a.d(0.5f, h6.v0(i11, d6Var), h6.v0(h6.f19131h5, d6Var)));
            yf0Var.setBackgroundBitmap(createBitmap);
            sg.a aVar = yf0Var.f43227b;
            aVar.f43215w = i11;
            aVar.f43216x = h6.Lj;
            aVar.b();
            addView(yf0Var, y5.e(160, 160, 1));
            yf0Var.j(100L);
            TextView f7 = org.telegram.messenger.f0.f(context, 1, 20.0f);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextColor(h6.v0(h6.G6, d6Var));
            ok.l(R.string.TelegramBusiness, f7, 17);
            addView(f7, y5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(h6.v0(h6.f19463z6, d6Var));
            ok.l(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, y5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f42595f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f42578a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            r20 r20Var = this.f42579b;
            r20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, r20Var.f27883c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f42580c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
