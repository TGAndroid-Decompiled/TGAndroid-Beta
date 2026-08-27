package qf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
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
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.y8;

public final class m1 extends FrameLayout {

    public final y8 f46381a;

    public final ImageReceiver f46382b;

    public final eh.s f46383c;
    public final bp d;

    public final ImageView f46384e;

    public final c6 f46385f;
    public boolean h;

    public final int[] f46386n;

    public boolean f46387r;

    public m1(Context context, c6 c6Var, boolean z10) {
        super(context);
        this.f46381a = new y8((c6) null);
        this.f46382b = new ImageReceiver(this);
        this.f46386n = new int[1];
        this.f46385f = c6Var;
        setWillNotDraw(false);
        int i10 = z10 ? 42 : 16;
        eh.s sVar = new eh.s(context);
        this.f46383c = sVar;
        sVar.setLines(2);
        sVar.setEllipsize(TextUtils.TruncateAt.END);
        sVar.setTextColor(g6.v0(g6.f23441z6, c6Var));
        sVar.setTextSize(1, 14.0f);
        boolean z11 = LocaleController.isRTL;
        addView(sVar, z5.d(-1, -2.0f, 7, z11 ? i10 : 64.0f, 7.0f, z11 ? 64.0f : i10, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.f46384e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Uh, false), PorterDuff.Mode.MULTIPLY));
            imageView.setAlpha(0.0f);
            addView(imageView, z5.e(50, 50, (LocaleController.isRTL ? 3 : 5) | 112));
        } else {
            this.f46384e = null;
        }
        bp bpVar = new bp(getContext(), 21, c6Var);
        this.d = bpVar;
        bpVar.b(-1, g6.f23053d6, g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        addView(bpVar, z5.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(p1 p1Var, String str, boolean z10) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ImageLocation imageLocation;
        TLRPC.Photo photo2;
        String strConcat = str;
        this.h = p1Var != null ? p1Var.f46423g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (strConcat != null && strConcat.length() > 0 && !strConcat.startsWith("/")) {
            strConcat = "/".concat(strConcat);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) p1Var.f46419b);
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        int i10 = g6.G6;
        c6 c6Var = this.f46385f;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(i10, c6Var)), 0, spannableStringBuilder.length(), 33);
        if (strConcat != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(g6.v0(g6.f23251o6, c6Var)), 0, Math.min(strConcat.length() <= 0 ? 1 : strConcat.length(), spannableStringBuilder.length()), 33);
        }
        MessageObject messageObject = p1Var.f46421e;
        eh.s sVar = this.f46383c;
        if (messageObject != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = p1Var.f46421e.caption;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = p1Var.f46421e.messageText;
            }
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), sVar.getPaint().getFontMetricsInt(), false);
            TLRPC.Message message = p1Var.f46421e.messageOwner;
            if (message != null) {
                MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, message.entities, sVar.getPaint().getFontMetricsInt());
            }
            spannableStringBuilder.append(charSequenceReplaceEmoji);
        }
        if (p1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
            int iA = p1Var.a() - 1;
            int i11 = org.telegram.ui.Components.z.d;
            SpannableString spannableString = new SpannableString("+");
            org.telegram.ui.Components.z zVar = new org.telegram.ui.Components.z(iA);
            int iDp2 = (int) (((pz0) zVar.f35104c).f31697c + AndroidUtilities.dp(10.0f));
            int[] iArr = this.f46386n;
            iArr[0] = iDp2;
            spannableString.setSpan(zVar, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, sVar.getPaint(), (iDp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        sVar.setText(spannableStringBuilder);
        int i12 = UserConfig.selectedAccount;
        TLRPC.MessageMedia media = MessageObject.getMedia(p1Var.f46421e);
        ImageReceiver imageReceiver = this.f46382b;
        if (media != null && (photo2 = media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
            MessageObject messageObject2 = p1Var.f46421e;
            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.size : 0L, (String) null, messageObject2, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media != null && media.document != null && (p1Var.f46421e.isVideo() || p1Var.f46421e.isSticker())) {
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
            long j11 = j10;
            MessageObject messageObject3 = p1Var.f46421e;
            imageReceiver.setImage(imageLocation, str2, messageObject3.strippedThumb, j11, (String) null, messageObject3, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        } else if (media == null || (webPage = media.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User currentUser = UserConfig.getInstance(i12).getCurrentUser();
            y8 y8Var = this.f46381a;
            y8Var.r(currentUser);
            imageReceiver.setForUserOrChat(UserConfig.getInstance(i12).getCurrentUser(), y8Var);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
            imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo), "36_36", p1Var.f46421e.strippedThumb, closestPhotoSizeWithSize3 != null ? closestPhotoSizeWithSize3.size : 0L, (String) null, media.webpage, 0);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        this.f46387r = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(51.0f) : AndroidUtilities.dp(15.0f);
        float fDp = AndroidUtilities.dp(7.0f);
        float fDp2 = AndroidUtilities.dp(36.0f);
        float fDp3 = AndroidUtilities.dp(36.0f);
        ImageReceiver imageReceiver = this.f46382b;
        imageReceiver.setImageCoords(measuredWidth, fDp, fDp2, fDp3);
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f46387r) {
            Paint paintT0 = g6.T0("paintDivider", this.f46385f);
            if (paintT0 == null) {
                paintT0 = g6.f23175k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), paintT0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f46387r ? 1 : 0), 1073741824));
    }

    public void setReorder(boolean z10) {
        this.f46384e.animate().alpha((!z10 || this.h) ? 0.0f : 1.0f).start();
    }
}
