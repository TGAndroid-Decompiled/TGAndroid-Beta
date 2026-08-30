package uf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.z8;
public final class l1 extends FrameLayout {
    public final z8 f45372a;
    public final ImageReceiver f45373b;
    public final ih.s f45374c;
    public final lp d;
    public final ImageView e;
    public final f6 f45375f;
    public boolean h;
    public final int[] f45376n;
    public boolean f45377r;

    public l1(Context context, f6 f6Var, boolean z4) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        this.f45372a = new z8((f6) null);
        this.f45373b = new ImageReceiver(this);
        this.f45376n = new int[1];
        this.f45375f = f6Var;
        setWillNotDraw(false);
        if (z4) {
            i10 = 42;
        } else {
            i10 = 16;
        }
        ih.s sVar = new ih.s(context);
        this.f45374c = sVar;
        sVar.setLines(2);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(j6.v0(j6.f20298z6, f6Var));
        sVar.setTextSize(1, 14.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f10 = i10;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = i10;
        }
        addView(sVar, b6.d(-1, -2.0f, 7, f10, 7.0f, f11, 0.0f));
        if (z4) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Uh, false), PorterDuff.Mode.MULTIPLY));
            imageView.setAlpha(0.0f);
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(imageView, b6.e(50, 50, i11 | 112));
        } else {
            this.e = null;
        }
        lp lpVar = new lp(getContext(), 21, f6Var);
        this.d = lpVar;
        lpVar.b(-1, j6.f19906d6, j6.f20032k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(3);
        addView(lpVar, b6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(o1 o1Var, String str, boolean z4) {
        boolean z10;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (o1Var != null) {
            z10 = o1Var.f45411g;
        } else {
            z10 = false;
        }
        this.h = z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) o1Var.f45408b);
        spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        int i10 = j6.G6;
        f6 f6Var = this.f45375f;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(j6.v0(i10, f6Var)), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(j6.v0(j6.f20103o6, f6Var));
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        MessageObject messageObject = o1Var.e;
        ih.s sVar = this.f45374c;
        if (messageObject != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = o1Var.e.caption;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = o1Var.e.messageText;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), sVar.getPaint().getFontMetricsInt(), false);
            TLRPC.Message message = o1Var.e.messageOwner;
            if (message != null) {
                MessageObject.replaceAnimatedEmoji(replaceEmoji, message.entities, sVar.getPaint().getFontMetricsInt());
            }
            spannableStringBuilder.append(replaceEmoji);
        }
        if (o1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
            int i11 = org.telegram.ui.Components.a0.d;
            SpannableString spannableString = new SpannableString("+");
            org.telegram.ui.Components.a0 a0Var = new org.telegram.ui.Components.a0(o1Var.a() - 1);
            this.f45376n[0] = (int) (((k01) a0Var.f23229c).f26084c + AndroidUtilities.dp(10.0f));
            spannableString.setSpan(a0Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, sVar.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        sVar.setText(spannableStringBuilder);
        int i12 = UserConfig.selectedAccount;
        TLRPC.MessageMedia media = MessageObject.getMedia(o1Var.e);
        long j11 = 0;
        ImageReceiver imageReceiver = this.f45373b;
        if (media != null && (photo2 = media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
            MessageObject messageObject2 = o1Var.e;
            BitmapDrawable bitmapDrawable = messageObject2.strippedThumb;
            if (closestPhotoSizeWithSize != null) {
                j11 = closestPhotoSizeWithSize.size;
            }
            imageReceiver.setImage(forObject, "36_36", bitmapDrawable, j11, (String) null, messageObject2, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && media.document != null && (o1Var.e.isVideo() || o1Var.e.isSticker())) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(media.document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
            if (closestPhotoSizeWithSize2 == null) {
                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                j10 = media.document.size;
                imageLocation = forDocument;
                str2 = "g";
            } else {
                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                j10 = closestPhotoSizeWithSize2.size;
                str2 = "36_36";
                imageLocation = forObject2;
            }
            long j12 = j10;
            MessageObject messageObject3 = o1Var.e;
            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j12, (String) null, messageObject3, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && (webPage = media.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject3 = ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo);
            BitmapDrawable bitmapDrawable2 = o1Var.e.strippedThumb;
            if (closestPhotoSizeWithSize3 != null) {
                j11 = closestPhotoSizeWithSize3.size;
            }
            imageReceiver.setImage(forObject3, "36_36", bitmapDrawable2, j11, (String) null, media.webpage, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
            z8 z8Var = this.f45372a;
            z8Var.r(currentUser);
            imageReceiver.setForUserOrChat(UserConfig.getInstance(i12).getCurrentUser(), z8Var);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
        }
        this.f45377r = z4;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        float f10;
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(51.0f);
        } else {
            dp = AndroidUtilities.dp(15.0f);
        }
        float f11 = dp;
        ImageReceiver imageReceiver = this.f45373b;
        imageReceiver.setImageCoords(f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f45377r) {
            Paint T0 = j6.T0("paintDivider", this.f45375f);
            if (T0 == null) {
                T0 = j6.f20025k0;
            }
            Paint paint = T0;
            float f12 = 64.0f;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float dp2 = AndroidUtilities.dp(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f12 = 0.0f;
            }
            canvas.drawRect(dp2, measuredHeight, width - AndroidUtilities.dp(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f45377r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z4) {
        float f10;
        ViewPropertyAnimator animate = this.e.animate();
        if (z4 && !this.h) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).start();
    }
}
