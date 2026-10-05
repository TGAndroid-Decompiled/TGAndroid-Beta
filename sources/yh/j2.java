package yh;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k90;
public final class j2 extends View {
    public final TextPaint f51485a;
    public final k90 f51486b;
    public final Paint f51487c;
    public final Paint d;
    public StaticLayout f51488e;
    public boolean f51489f;
    public int h;
    public int f51490n;
    public BitmapShader f51491r;
    public Matrix f51492s;
    public Matrix v;
    public CharSequence f51493w;

    public j2(Context context) {
        super(context);
        this.h = AndroidUtilities.dp(6.0f);
        this.f51490n = AndroidUtilities.dp(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f51485a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        Paint paint = new Paint(1);
        this.f51487c = paint;
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(9.66f)));
        this.f51486b = new k90(0);
    }

    public final void a(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            this.f51493w = charSequence;
            return;
        }
        this.f51488e = new StaticLayout(charSequence, this.f51485a, i10 - AndroidUtilities.dp(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        k90 k90Var = this.f51486b;
        k90Var.rewind();
        int i11 = this.h;
        int i12 = this.f51490n;
        k90Var.f33060e = i11;
        k90Var.f33061f = i12;
        if (this.f51489f) {
            k90Var.e(null, 0, 0.0f, 0.0f);
            float f7 = Float.MAX_VALUE;
            float width = this.f51488e.getWidth();
            float f10 = Float.MIN_VALUE;
            float f11 = 0.0f;
            for (int i13 = 0; i13 < this.f51488e.getLineCount(); i13++) {
                width = Math.min(width, this.f51488e.getLineLeft(i13));
                f10 = Math.min(f10, this.f51488e.getLineTop(i13));
                f11 = Math.max(f11, this.f51488e.getLineRight(i13));
                f7 = Math.max(f7, this.f51488e.getLineBottom(i13));
            }
            this.f51486b.addRect(width, f10, f11, this.f51488e.getHeight(), Path.Direction.CW);
        } else {
            k90Var.e(this.f51488e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.f51488e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), k90Var);
            k90Var.a();
        }
        invalidate();
    }

    public final void b(int i10, TL_stars.SavedStarGift savedStarGift) {
        int i11;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(savedStarGift.gift.owner_id);
            if (clientUserId == peerDialogId) {
                if (savedStarGift.gift.crafted) {
                    i11 = R.string.GiftSelfTopActionCrafted;
                } else {
                    i11 = R.string.GiftSelfTopAction;
                }
                set(AndroidUtilities.replaceTags(LocaleController.formatString(i11, LocaleController.formatDate(savedStarGift.date))));
                return;
            } else if (clientUserId == peerDialogId2) {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i10, peerDialogId), LocaleController.formatDate(savedStarGift.date))));
                return;
            } else {
                set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i10, peerDialogId), DialogObject.getShortName(i10, peerDialogId2), LocaleController.formatDate(savedStarGift.date))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f51488e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.f51488e.getWidth()) / 2.0f, AndroidUtilities.dp(16.0f));
            Matrix matrix = this.f51492s;
            if (matrix != null) {
                matrix.reset();
                this.v.reset();
                j2 j2Var = this;
                while (j2Var != 0) {
                    this.v.postConcat(j2Var.getMatrix());
                    if (j2Var.getParent() instanceof View) {
                        j2Var = (View) j2Var.getParent();
                    } else {
                        j2Var = 0;
                    }
                }
                this.v.invert(this.f51492s);
                this.f51492s.preTranslate((-this.h) / 2, -AndroidUtilities.dp(16.0f));
                this.f51492s.preScale(12.0f, 12.0f);
                this.f51491r.setLocalMatrix(this.f51492s);
            }
            Paint paint = this.f51487c;
            k90 k90Var = this.f51486b;
            canvas.drawPath(k90Var, paint);
            int l1 = org.telegram.ui.ActionBar.i6.l1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(l1);
            canvas.drawPath(k90Var, paint2);
            this.f51488e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        int size = View.MeasureSpec.getSize(i10);
        CharSequence charSequence = this.f51493w;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.f51488e;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight() + AndroidUtilities.dp(32.0f);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.action != null) {
            int i10 = messageObject.currentAccount;
            long clientUserId = UserConfig.getInstance(i10).getClientUserId();
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                setVisibility(8);
                return;
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
                if (peer == null) {
                    setVisibility(8);
                    return;
                }
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.peer);
                if (clientUserId == peerDialogId) {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString((tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? R.string.GiftSelfTopActionCrafted : R.string.GiftSelfTopAction, LocaleController.formatDate(messageObject.messageOwner.date))));
                } else if (clientUserId == peerDialogId2) {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopAction, DialogObject.getShortName(i10, peerDialogId), LocaleController.formatDate(messageObject.messageOwner.date))));
                } else {
                    set(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftTopActionFromTo, DialogObject.getShortName(i10, peerDialogId), DialogObject.getShortName(i10, peerDialogId2), LocaleController.formatDate(messageObject.messageOwner.date))));
                }
                setVisibility(0);
                return;
            } else {
                setVisibility(8);
                return;
            }
        }
        setVisibility(8);
    }

    public void setFullRect(boolean z10) {
        this.f51489f = z10;
    }

    public void setRoundRadius(float f7) {
        this.f51487c.setPathEffect(new CornerPathEffect(f7));
        this.d.setPathEffect(new CornerPathEffect(f7));
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}
