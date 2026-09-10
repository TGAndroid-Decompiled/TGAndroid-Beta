package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.iz;
public final class b7 extends w6 {
    public final yg.p0 I;
    public final a7 J;
    public final yg.g0 K;
    public final ImageReceiver L;
    public final org.telegram.ui.Components.d6 M;
    public final org.telegram.ui.Components.n6 N;
    public boolean O;

    public b7(Context context, y6 y6Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction, iz izVar) {
        super(context, y6Var, tL_mediaAreaSuggestedReaction);
        TLRPC.TL_availableReaction tL_availableReaction;
        ArrayList arrayList;
        a7 a7Var = new a7(this);
        this.J = a7Var;
        yg.g0 g0Var = new yg.g0(this);
        this.K = g0Var;
        this.L = new ImageReceiver(this);
        this.M = new org.telegram.ui.Components.d6(this);
        this.N = new org.telegram.ui.Components.n6(false, false, false, false);
        yg.p0 d = yg.p0.d(tL_mediaAreaSuggestedReaction.reaction);
        this.I = d;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            a7Var.b(true, false);
        }
        a7Var.c(getScaleX());
        g0Var.e(d);
        izVar.getClass();
        String str = d.f47101f;
        str = str == null ? MessageObject.findAnimatedEmojiEmoticon(org.telegram.ui.Components.p5.f(izVar.f33816b, d.f47102g)) : str;
        if (str != null && (arrayList = (ArrayList) izVar.e.get(str)) != null && !arrayList.isEmpty()) {
            int min = Math.min(1, arrayList.size());
            for (int i10 = 0; i10 < min; i10++) {
                izVar.m((TLRPC.Document) arrayList.get(i10));
            }
        }
        if (this.I.f47101f != null && (tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(this.I.f47101f)) != null) {
            this.L.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
        }
        org.telegram.ui.Components.n6 n6Var = this.N;
        n6Var.f25425b = 17;
        n6Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        this.N.t(AndroidUtilities.dp(18.0f));
        this.N.G = AndroidUtilities.displaySize.x;
        if (tL_mediaAreaSuggestedReaction.dark) {
            this.J.a();
            this.N.r(-1);
        }
    }

    @Override
    public final void a(Canvas canvas) {
        float f7;
        int i10;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        a7 a7Var = this.J;
        a7Var.setBounds(0, 0, measuredWidth, measuredHeight);
        a7Var.draw(canvas);
        float measuredWidth2 = ((int) (getMeasuredWidth() * 0.61f)) / 2.0f;
        float centerX = a7Var.getBounds().centerX() - measuredWidth2;
        float centerY = a7Var.getBounds().centerY() - measuredWidth2;
        float centerX2 = a7Var.getBounds().centerX() + measuredWidth2;
        float centerY2 = a7Var.getBounds().centerY() + measuredWidth2;
        float height = (a7Var.getBounds().height() * 0.427f) + a7Var.getBounds().top;
        float f10 = height - measuredWidth2;
        float f11 = height + measuredWidth2;
        if (this.O) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.M.d(f7, false);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) centerX, (int) AndroidUtilities.lerp(centerY, f10, d), (int) centerX2, (int) AndroidUtilities.lerp(centerY2, f11, d));
        if (a7Var.f48274a == 1) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        yg.g0 g0Var = this.K;
        g0Var.d(i10);
        g0Var.c(rect);
        g0Var.a(canvas);
        float height2 = (a7Var.getBounds().height() * 0.839f) + a7Var.getBounds().top;
        org.telegram.ui.Components.n6 n6Var = this.N;
        n6Var.setBounds(a7Var.getBounds().left, (int) (height2 - AndroidUtilities.dp(10.0f)), a7Var.getBounds().right, (int) (AndroidUtilities.dp(10.0f) + height2));
        canvas.save();
        canvas.scale(d, d, a7Var.getBounds().centerX(), height2);
        n6Var.draw(canvas);
        canvas.restore();
    }

    public final void c(TL_stories.StoryViews storyViews, boolean z10) {
        boolean z11;
        boolean z12;
        float f7 = 0.0f;
        org.telegram.ui.Components.d6 d6Var = this.M;
        if (storyViews != null) {
            for (int i10 = 0; i10 < storyViews.reactions.size(); i10++) {
                if (yg.r0.d(storyViews.reactions.get(i10).reaction, this.I)) {
                    if (z10 && this.O) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (storyViews.reactions.get(i10).count > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.O = z12;
                    this.N.q(AndroidUtilities.formatWholeNumber(storyViews.reactions.get(i10).count, 0), z11, true);
                    if (!z10) {
                        if (this.O) {
                            f7 = 1.0f;
                        }
                        d6Var.d(f7, true);
                        return;
                    }
                    return;
                }
            }
        }
        this.O = false;
        invalidate();
        if (!z10) {
            if (this.O) {
                f7 = 1.0f;
            }
            d6Var.d(f7, true);
        }
    }

    public org.telegram.ui.Components.p5 getAnimatedEmojiDrawable() {
        return this.K.f47004b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.b(true);
        this.L.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.b(false);
        this.L.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.N.t(Math.min(AndroidUtilities.dp(18.0f), getMeasuredHeight() * 0.156f));
    }

    @Override
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            this.J.c(f7);
            super.setScaleX(f7);
        }
    }
}
