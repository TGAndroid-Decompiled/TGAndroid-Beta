package zg;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.cz;
public final class d {
    public static int f49277m;
    public q5 f49278a;
    public Rect f49279b;
    public ArrayList f49280c;
    public View d;
    public long e;
    public boolean f49281f;
    public boolean f49282g;
    public int h;
    public boolean f49283i;
    public ImageReceiver f49284j;
    public int f49285k;
    public long f49286l;

    public static d a(q5 q5Var, boolean z10, boolean z11) {
        int i10 = UserConfig.selectedAccount;
        ?? obj = new Object();
        obj.f49279b = new Rect();
        obj.f49280c = new ArrayList();
        obj.f49282g = true;
        obj.f49285k = -1;
        obj.f49278a = q5Var;
        obj.f49281f = z10;
        obj.h = i10;
        obj.f49283i = z11;
        obj.e = System.currentTimeMillis();
        if (z11 && LiteMode.isEnabled(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            obj.f49284j = imageReceiver;
            if (z10) {
                imageReceiver.setAllowDrawWhileCacheGenerating(true);
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: zg.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f49278a.o(view);
        ImageReceiver imageReceiver = this.f49284j;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.f49279b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.f49284j;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f49281f;
        int i10 = this.h;
        q5 q5Var = this.f49278a;
        q5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f49284j;
        if (imageReceiver != null && this.f49283i) {
            imageReceiver.onAttachedToWindow();
            TLRPC.Document document2 = q5Var.e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
            if (findAnimatedEmojiEmoticon != null && (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(findAnimatedEmojiEmoticon)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = f49277m;
                    f49277m = i11 + 1;
                    sb2.append(i11);
                    sb2.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb2.toString());
                    int f7 = cz.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), f7 + "_" + f7 + "_pcache_compress", null, null, document3, 0);
                } else {
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    String a2 = k0.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.setImage(forDocument, a2, null, null, document4, 0);
                }
                z11 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            if (!z11) {
                String str = UserConfig.getInstance(i10).genericAnimationsStickerPack;
                if (str != null && (tL_messages_stickerSet = MediaDataController.getInstance(i10).getStickerSetByName(str)) == null) {
                    tL_messages_stickerSet = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f49285k < 0) {
                        this.f49285k = Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size());
                    }
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        int i12 = f49277m;
                        f49277m = i12 + 1;
                        sb3.append(i12);
                        sb3.append(" ");
                        imageReceiver.setUniqKeyPrefix(sb3.toString());
                        int f10 = cz.f();
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f49285k)), f10 + "_" + f10 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f49285k), 0);
                    } else {
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f49285k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f49285k), 0);
                    }
                    z11 = true;
                }
            }
            if (z11) {
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, z10);
                }
                imageReceiver.setAutoRepeat(0);
                return;
            }
            imageReceiver.setImageBitmap(new ij0(R.raw.custom_emoji_reaction, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        }
    }
}
