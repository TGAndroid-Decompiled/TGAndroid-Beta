package sg;

import ai.zd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x20;
import w7.z5;
public final class g extends FrameLayout {
    public final w9 f46258a;
    public final x20 f46259b;
    public final int f46260c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        x20 x20Var = new x20();
        this.f46259b = x20Var;
        int i10 = jVar.f46278f;
        d6 d6Var = jVar.f46215a;
        if (i10 == 0) {
            this.f46260c = AndroidUtilities.dp(150.0f);
            w9 w9Var = new w9(context);
            this.f46258a = w9Var;
            w9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(w9Var, z5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            h9 h9Var = new h9((d6) null);
            h9Var.r(currentUser);
            w9Var.getImageReceiver().setForUserOrChat(currentUser, h9Var);
            TextView textView = new TextView(context);
            k3.m(20.0f, 1, textView);
            textView.setTextColor(h6.w0(h6.G6, d6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, z5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            x20Var.f32324m = true;
            x20Var.f32315a = true;
            x20Var.d(h6.x0(null, h6.Mj, false), h6.x0(null, h6.Lj, false), 0, 0);
            x20Var.f32317c.setStyle(Paint.Style.STROKE);
            x20Var.f32317c.setStrokeCap(Paint.Cap.ROUND);
            x20Var.f32317c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            gi.f fVar = new gi.f(context, 4);
            addView(fVar, z5.e(-1, 190, 55));
            zd zdVar = new zd(context, 1, 1, 2);
            zdVar.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = h6.Mj;
            canvas.drawColor(i0.a.f(0.5f, h6.w0(i11, d6Var), h6.w0(h6.f21064h5, d6Var)));
            zdVar.setBackgroundBitmap(createBitmap);
            tg.g gVar = zdVar.f47111b;
            gVar.f47095z = i11;
            gVar.A = h6.Lj;
            gVar.b();
            addView(zdVar, z5.e(160, 160, 1));
            zdVar.m(100L);
            TextView f7 = org.telegram.messenger.g0.f(context, 1, 20.0f);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextColor(h6.w0(h6.G6, d6Var));
            ok.m(R.string.TelegramBusiness, f7, 17);
            addView(f7, z5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(h6.w0(h6.f21398z6, d6Var));
            ok.m(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, z5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f46278f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f46258a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            x20 x20Var = this.f46259b;
            x20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, x20Var.f32317c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f46260c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
