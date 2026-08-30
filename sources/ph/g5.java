package ph;

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
public final class g5 extends FrameLayout {
    public final int f41681a;
    public int f41682b;
    public final dg.v3 f41683c;
    public final FrameLayout d;
    public final nh.a8 e;
    public boolean f41684f;
    public boolean h;

    public g5(Activity activity, int i10, nh.b bVar) {
        super(activity);
        this.f41682b = 1;
        this.f41684f = false;
        this.h = false;
        this.f41681a = i10;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        dg.v3 v3Var = new dg.v3(this, getContext());
        this.f41683c = v3Var;
        nh.z3 z3Var = new nh.z3(getContext(), null);
        z3Var.f16112a.getAvatarDrawable().m(i10, currentUser);
        nh.y3 y3Var = z3Var.f16112a;
        y3Var.e(currentUser, y3Var.getAvatarDrawable());
        z3Var.f16113b.l(Emoji.replaceEmoji(UserObject.getUserName(currentUser), z3Var.f16113b.getPaint().getFontMetricsInt(), false), false);
        z3Var.c(LocaleController.getString(R.string.RightNow), false);
        v3Var.addView(z3Var, k7.b6.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        v3Var.addView(imageView, k7.b6.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(v3Var, k7.b6.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        nh.a8 a8Var = new nh.a8(getContext(), bVar);
        this.e = a8Var;
        a8Var.f15090p0 = true;
        a8Var.setTranslationY(AndroidUtilities.dp(8.0f));
        frameLayout.addView(a8Var, k7.b6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, k7.b6.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), i0.a.k(-16777216, 122)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(LocaleController.getString(R.string.ReplyPrivately));
        frameLayout2.addView(textView, k7.b6.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, k7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, k7.b6.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, k7.b6.c(-1.0f, -1));
        v3Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z4, boolean z10, FrameLayout frameLayout) {
        View view;
        float f10;
        if (z4) {
            if (this.f41684f != z10) {
                this.f41684f = z10;
            } else {
                return;
            }
        } else if (this.h != z10) {
            this.h = z10;
        } else {
            return;
        }
        if (z4) {
            view = this.f41683c;
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
        this.e.V.b(org.telegram.ui.Components.u5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
