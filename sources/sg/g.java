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
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.x9;
import org.telegram.ui.eg0;
import w7.x5;
public final class g extends FrameLayout {
    public final x9 f46124a;
    public final o20 f46125b;
    public final int f46126c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        o20 o20Var = new o20();
        this.f46125b = o20Var;
        int i10 = jVar.f46147f;
        f6 f6Var = jVar.f46050a;
        if (i10 == 0) {
            this.f46126c = AndroidUtilities.dp(150.0f);
            x9 x9Var = new x9(context);
            this.f46124a = x9Var;
            x9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(x9Var, x5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            i9 i9Var = new i9((f6) null);
            i9Var.r(currentUser);
            x9Var.getImageReceiver().setForUserOrChat(currentUser, i9Var);
            TextView textView = new TextView(context);
            e2.m(20.0f, 1, textView);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, x5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            o20Var.f28965m = true;
            o20Var.f28955a = true;
            o20Var.d(j6.w0(null, j6.Mj, false), j6.w0(null, j6.Lj, false), 0, 0);
            o20Var.f28957c.setStyle(Paint.Style.STROKE);
            o20Var.f28957c.setStrokeCap(Paint.Cap.ROUND);
            o20Var.f28957c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            fi.g gVar = new fi.g(context, 4);
            addView(gVar, x5.e(-1, 190, 55));
            eg0 eg0Var = new eg0(context, 1, 1, 1);
            eg0Var.setStarParticlesView(gVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = j6.Mj;
            canvas.drawColor(i0.a.d(0.5f, j6.v0(i11, f6Var), j6.v0(j6.f20761h5, f6Var)));
            eg0Var.setBackgroundBitmap(createBitmap);
            tg.a aVar = eg0Var.f46547b;
            aVar.f46535w = i11;
            aVar.f46536x = j6.Lj;
            aVar.b();
            addView(eg0Var, x5.e(160, 160, 1));
            eg0Var.j(100L);
            TextView g10 = org.telegram.messenger.w1.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(j6.v0(j6.G6, f6Var));
            wl.k(R.string.TelegramBusiness, g10, 17);
            addView(g10, x5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(j6.f21088z6, f6Var));
            wl.k(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, x5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f46147f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f46124a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            o20 o20Var = this.f46125b;
            o20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, o20Var.f28957c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f46126c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
