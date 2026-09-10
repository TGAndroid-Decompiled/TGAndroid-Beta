package zh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class e3 {
    public final int f48369a;
    public final ImageReceiver f48370b;
    public int f48371c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.d6 f48372f;
    public final org.telegram.ui.Components.d6 f48373g;
    public final org.telegram.ui.Components.d6 h;
    public float f48374i;
    public float f48375j;
    public float f48376k;
    public final boolean f48377l;
    public final RectF f48378m;
    public final RectF f48379n;

    public e3(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f48370b = imageReceiver;
        this.f48371c = 0;
        this.d = false;
        this.e = 1.0f;
        wr wrVar = wr.h;
        this.f48372f = new org.telegram.ui.Components.d6(profileStoriesView, 420L, wrVar);
        this.f48373g = new org.telegram.ui.Components.d6(profileStoriesView, 420L, wrVar);
        this.h = new org.telegram.ui.Components.d6(profileStoriesView, 420L, wrVar);
        this.f48378m = new RectF();
        this.f48379n = new RectF();
        this.f48369a = storyItem.f17435id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f48377l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f30656x) {
            imageReceiver.onAttachedToWindow();
        }
        x20[] x20VarArr = a6.f48257a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            g9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, g9Var);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.clearImage();
            }
        }
    }
}
