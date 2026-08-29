package sf;

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
import i7.f6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.zz0;
public final class m1 extends FrameLayout {
    public final e9 f47884a;
    public final ImageReceiver f47885b;
    public final gh.s f47886c;
    public final hp d;
    public final ImageView f47887e;
    public final c6 f47888f;
    public boolean h;
    public final int[] f47889n;
    public boolean f47890r;

    public m1(Context context, c6 c6Var, boolean z10) {
        super(context);
        int i10;
        float f9;
        float f10;
        int i11;
        this.f47884a = new e9((c6) null);
        this.f47885b = new ImageReceiver(this);
        this.f47889n = new int[1];
        this.f47888f = c6Var;
        setWillNotDraw(false);
        if (z10) {
            i10 = 42;
        } else {
            i10 = 16;
        }
        gh.s sVar = new gh.s(context);
        this.f47886c = sVar;
        sVar.setLines(2);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(g6.v0(g6.f23450z6, c6Var));
        sVar.setTextSize(1, 14.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f9 = i10;
        } else {
            f9 = 64.0f;
        }
        if (z11) {
            f10 = 64.0f;
        } else {
            f10 = i10;
        }
        addView(sVar, f6.d(-1, -2.0f, 7, f9, 7.0f, f10, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f47887e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Uh, false), PorterDuff.Mode.MULTIPLY));
            imageView.setAlpha(0.0f);
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            addView(imageView, f6.e(50, 50, i11 | 112));
        } else {
            this.f47887e = null;
        }
        hp hpVar = new hp(getContext(), 21, c6Var);
        this.d = hpVar;
        hpVar.b(-1, g6.f23062d6, g6.f23190k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(3);
        addView(hpVar, f6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(r1 r1Var, String str, boolean z10) {
        boolean z11;
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo2;
        int[] iArr;
        int length;
        String str3 = str;
        if (r1Var != null) {
            z11 = r1Var.f47940g;
        } else {
            z11 = false;
        }
        this.h = z11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) r1Var.f47936b);
        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        int i10 = g6.G6;
        c6 c6Var = this.f47888f;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(g6.v0(g6.f23260o6, c6Var));
            if (str3.length() <= 0) {
                length = 1;
            } else {
                length = str3.length();
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, Math.min(length, spannableStringBuilder.length()), 33);
        }
        MessageObject messageObject = r1Var.f47938e;
        gh.s sVar = this.f47886c;
        if (messageObject != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = r1Var.f47938e.caption;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = r1Var.f47938e.messageText;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), sVar.getPaint().getFontMetricsInt(), false);
            TLRPC.Message message = r1Var.f47938e.messageOwner;
            if (message != null) {
                MessageObject.replaceAnimatedEmoji(replaceEmoji, message.entities, sVar.getPaint().getFontMetricsInt());
            }
            spannableStringBuilder.append(replaceEmoji);
        }
        if (r1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int dp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
            int i11 = org.telegram.ui.Components.b0.d;
            SpannableString spannableString = new SpannableString("+");
            org.telegram.ui.Components.b0 b0Var = new org.telegram.ui.Components.b0(r1Var.a() - 1);
            this.f47889n[0] = (int) (((zz0) b0Var.f26928c).f35462c + AndroidUtilities.dp(10.0f));
            spannableString.setSpan(b0Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, sVar.getPaint(), (dp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        sVar.setText(spannableStringBuilder);
        int i12 = UserConfig.selectedAccount;
        TLRPC.MessageMedia media = MessageObject.getMedia(r1Var.f47938e);
        long j11 = 0;
        ImageReceiver imageReceiver = this.f47885b;
        if (media != null && (photo2 = media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
            MessageObject messageObject2 = r1Var.f47938e;
            BitmapDrawable bitmapDrawable = messageObject2.strippedThumb;
            if (closestPhotoSizeWithSize != null) {
                j11 = closestPhotoSizeWithSize.size;
            }
            imageReceiver.setImage(forObject, "36_36", bitmapDrawable, j11, (String) null, messageObject2, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && media.document != null && (r1Var.f47938e.isVideo() || r1Var.f47938e.isSticker())) {
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
            MessageObject messageObject3 = r1Var.f47938e;
            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j12, (String) null, messageObject3, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && (webPage = media.webpage) != null && (photo = webPage.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject3 = ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo);
            BitmapDrawable bitmapDrawable2 = r1Var.f47938e.strippedThumb;
            if (closestPhotoSizeWithSize3 != null) {
                j11 = closestPhotoSizeWithSize3.size;
            }
            imageReceiver.setImage(forObject3, "36_36", bitmapDrawable2, j11, (String) null, media.webpage, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else {
            TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
            e9 e9Var = this.f47884a;
            e9Var.r(currentUser);
            imageReceiver.setForUserOrChat(UserConfig.getInstance(i12).getCurrentUser(), e9Var);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
        }
        this.f47890r = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        float f9;
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(51.0f);
        } else {
            dp = AndroidUtilities.dp(15.0f);
        }
        float f10 = dp;
        ImageReceiver imageReceiver = this.f47885b;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f47890r) {
            Paint T0 = g6.T0("paintDivider", this.f47888f);
            if (T0 == null) {
                T0 = g6.f23183k0;
            }
            Paint paint = T0;
            float f11 = 64.0f;
            if (LocaleController.isRTL) {
                f9 = 0.0f;
            } else {
                f9 = 64.0f;
            }
            float dp2 = AndroidUtilities.dp(f9);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp2, measuredHeight, width - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f47890r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        float f9;
        ViewPropertyAnimator animate = this.f47887e.animate();
        if (z10 && !this.h) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        animate.alpha(f9).start();
    }
}
