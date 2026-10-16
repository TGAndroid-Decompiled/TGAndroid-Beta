package sg;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import org.telegram.ui.ig0;
import w7.z5;
public final class g extends FrameLayout {
    public final z9 f45183a;
    public final b30 f45184b;
    public final int f45185c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        b30 b30Var = new b30();
        this.f45184b = b30Var;
        int i10 = jVar.f45202f;
        c6 c6Var = jVar.f45138a;
        if (i10 == 0) {
            this.f45185c = AndroidUtilities.dp(150.0f);
            z9 z9Var = new z9(context);
            this.f45183a = z9Var;
            z9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(z9Var, z5.a(65.0f, 0.0f, 32.0f, 0.0f, 0.0f, 65, 1));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            k9 k9Var = new k9((c6) null);
            k9Var.r(currentUser);
            z9Var.getImageReceiver().setForUserOrChat(currentUser, k9Var);
            TextView textView = new TextView(context);
            k3.m(20.0f, 1, textView);
            textView.setTextColor(g6.w0(g6.G6, c6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, z5.a(-2.0f, 0.0f, 111.0f, 0.0f, 0.0f, -2, 1));
            b30Var.f23380m = true;
            b30Var.f23371a = true;
            b30Var.d(g6.x0(null, g6.Mj, false), g6.x0(null, g6.Lj, false), 0, 0);
            b30Var.f23373c.setStyle(Paint.Style.STROKE);
            b30Var.f23373c.setStrokeCap(Paint.Cap.ROUND);
            b30Var.f23373c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            fi.f fVar = new fi.f(context, 4);
            addView(fVar, z5.e(-1, 190, 55));
            ig0 ig0Var = new ig0(context, 1, 1, 1);
            ig0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = g6.Mj;
            canvas.drawColor(i0.a.d(0.5f, g6.w0(i11, c6Var), g6.w0(g6.f19672h5, c6Var)));
            ig0Var.setBackgroundBitmap(createBitmap);
            tg.g gVar = ig0Var.f45740b;
            gVar.f45724z = i11;
            gVar.A = g6.Lj;
            gVar.b();
            addView(ig0Var, z5.e(160, 160, 1));
            ig0Var.m(100L);
            TextView f7 = org.telegram.messenger.g0.f(context, 1, 20.0f);
            f7.setTypeface(AndroidUtilities.bold());
            f7.setTextColor(g6.w0(g6.G6, c6Var));
            sk.m(R.string.TelegramBusiness, f7, 17);
            addView(f7, z5.a(-2.0f, 33.0f, 150.0f, 33.0f, 0.0f, -2, 1));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(g6.w0(g6.f20005z6, c6Var));
            sk.m(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, z5.a(-2.0f, 33.0f, 183.0f, 33.0f, 20.0f, -2, 1));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f45202f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f45183a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            b30 b30Var = this.f45184b;
            b30Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, b30Var.f23373c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f45185c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
