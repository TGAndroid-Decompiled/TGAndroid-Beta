package qh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class f5 extends FrameLayout {
    public final int f45324a;
    public int f45325b;
    public final eg.t3 f45326c;
    public final FrameLayout d;
    public final oh.a8 f45327e;
    public boolean f45328f;
    public boolean h;

    public f5(Activity activity, int i10, oh.b bVar) {
        super(activity);
        this.f45325b = 1;
        this.f45328f = false;
        this.h = false;
        this.f45324a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        eg.t3 t3Var = new eg.t3(this, getContext());
        this.f45326c = t3Var;
        oh.b4 b4Var = new oh.b4(getContext(), null);
        b4Var.f16886a.getAvatarDrawable().m(i10, currentUser);
        oh.a4 a4Var = b4Var.f16886a;
        a4Var.e(currentUser, a4Var.getAvatarDrawable());
        b4Var.f16887b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), b4Var.f16887b.getPaint().getFontMetricsInt(), false), false);
        b4Var.c(LocaleController.getString(R.string.RightNow), false);
        t3Var.addView(b4Var, k7.c6.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        t3Var.addView(imageView, k7.c6.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(t3Var, k7.c6.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        oh.a8 a8Var = new oh.a8(getContext(), bVar);
        this.f45327e = a8Var;
        a8Var.f16860p0 = true;
        a8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(a8Var, k7.c6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, k7.c6.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, k7.c6.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, k7.c6.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, k7.c6.c(-1.0f, -1));
        t3Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z4, boolean z10, FrameLayout frameLayout) {
        View view;
        float f10;
        if (z4) {
            if (this.f45328f != z10) {
                this.f45328f = z10;
            } else {
                return;
            }
        } else if (this.h != z10) {
            this.h = z10;
        } else {
            return;
        }
        if (z4) {
            view = this.f45326c;
        } else {
            view = this.d;
        }
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        float f11 = 0.0f;
        if (z10) {
            if (z4) {
                f10 = 0.5f;
            } else {
                f10 = 0.2f;
            }
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            ViewPropertyAnimator animate2 = frameLayout.animate();
            if (!z10) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.f45327e.V.b(org.telegram.ui.Components.u5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
