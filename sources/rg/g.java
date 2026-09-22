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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.u9;
import org.telegram.ui.eg0;
import w7.x5;
public final class g extends FrameLayout {
    public final u9 f42288a;
    public final o20 f42289b;
    public final int f42290c;
    public final j d;

    public g(j jVar, Context context) {
        super(context);
        this.d = jVar;
        o20 o20Var = new o20();
        this.f42289b = o20Var;
        int i10 = jVar.f42305f;
        e6 e6Var = jVar.f42248a;
        if (i10 == 0) {
            this.f42290c = AndroidUtilities.dp(150.0f);
            u9 u9Var = new u9(context);
            this.f42288a = u9Var;
            u9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(u9Var, x5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            f9 f9Var = new f9((e6) null);
            f9Var.r(currentUser);
            u9Var.getImageReceiver().setForUserOrChat(currentUser, f9Var);
            TextView textView = new TextView(context);
            e2.l(20.0f, 1, textView);
            textView.setTextColor(i6.v0(i6.G6, e6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, x5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            o20Var.f26664m = true;
            o20Var.f26655a = true;
            o20Var.d(i6.w0(null, i6.Mj, false), i6.w0(null, i6.Lj, false), 0, 0);
            o20Var.f26657c.setStyle(Paint.Style.STROKE);
            o20Var.f26657c.setStrokeCap(Paint.Cap.ROUND);
            o20Var.f26657c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        } else if (i10 == 1) {
            ei.f fVar = new ei.f(context, 4);
            addView(fVar, x5.e(-1, 190, 55));
            eg0 eg0Var = new eg0(context, 1, 1, 1);
            eg0Var.setStarParticlesView(fVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = i6.Mj;
            canvas.drawColor(i0.a.d(0.5f, i6.v0(i11, e6Var), i6.v0(i6.f18904h5, e6Var)));
            eg0Var.setBackgroundBitmap(createBitmap);
            sg.a aVar = eg0Var.f42933b;
            aVar.f42921w = i11;
            aVar.f42922x = i6.Lj;
            aVar.b();
            addView(eg0Var, x5.e(160, 160, 1));
            eg0Var.j(100L);
            TextView g10 = org.telegram.messenger.y0.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(i6.v0(i6.G6, e6Var));
            vl.l(R.string.TelegramBusiness, g10, 17);
            addView(g10, x5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(i6.v0(i6.f19234z6, e6Var));
            vl.l(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, x5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f42305f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.f42288a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            o20 o20Var = this.f42289b;
            o20Var.c(rectF);
            float f7 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f7) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f7) - f11) - f12, false, o20Var.f26657c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f42290c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
