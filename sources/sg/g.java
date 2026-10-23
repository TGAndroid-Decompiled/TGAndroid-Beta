package sg;

import ai.ae;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x20;
import w7.z5;
public final class g extends FrameLayout {
    public final w9 f46685a;
    public final x20 f46686b;
    public final int f46687c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        x20 x20Var = new x20();
        this.f46686b = x20Var;
        int i10 = jVar.f46705f;
        g6 g6Var = jVar.f46640a;
        if (i10 == 0) {
            this.f46687c = AndroidUtilities.dp(150.0f);
            w9 w9Var = new w9(context);
            this.f46685a = w9Var;
            w9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(w9Var, z5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            h9 h9Var = new h9((g6) null);
            h9Var.r(currentUser);
            w9Var.getImageReceiver().setForUserOrChat(currentUser, h9Var);
            TextView textView = new TextView(context);
            k3.m(20.0f, 1, textView);
            r6.W(textView, k6.G6, g6Var);
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, z5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            x20Var.f32415m = true;
            x20Var.f32406a = true;
            x20Var.d(k6.x0(null, k6.Mj, false), k6.x0(null, k6.Lj, false), 0, 0);
            x20Var.f32408c.setStyle(Paint.Style.STROKE);
            x20Var.f32408c.setStrokeCap(Paint.Cap.ROUND);
            x20Var.f32408c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            gi.f fVar = new gi.f(context, 4);
            addView(fVar, z5.e(-1, 190, 55));
            ae aeVar = new ae(context, 1, 1, 2);
            aeVar.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = k6.Mj;
            canvas.drawColor(i0.a.f(0.5f, k6.w0(i11, g6Var), k6.w0(k6.f21254h5, g6Var)));
            aeVar.setBackgroundBitmap(createBitmap);
            tg.g gVar = aeVar.f47547b;
            gVar.f47531z = i11;
            gVar.A = k6.Lj;
            gVar.b();
            addView(aeVar, z5.e(160, 160, 1));
            aeVar.m(100L);
            TextView g10 = org.telegram.messenger.v0.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            r6.W(g10, k6.G6, g6Var);
            sl.m(R.string.TelegramBusiness, g10, 17);
            addView(g10, z5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            r6.W(textView2, k6.f21588z6, g6Var);
            sl.m(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, z5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f46705f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f46685a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            x20 x20Var = this.f46686b;
            x20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, x20Var.f32408c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f46687c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
