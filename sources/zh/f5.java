package zh;

import android.text.TextUtils;
import android.view.View;
import bi.r9;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f5 implements Runnable {
    public final int f48414a;
    public final long f48415b;
    public final Object f48416c;
    public final Object d;

    public f5(Object obj, long j3, TL_stories.StoryItem storyItem, int i10) {
        this.f48414a = i10;
        this.f48416c = obj;
        this.f48415b = j3;
        this.d = storyItem;
    }

    @Override
    public final void run() {
        switch (this.f48414a) {
            case 0:
                h5 h5Var = (h5) this.f48416c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                i5 i5Var = h5Var.M;
                bi.f1 f1Var = i5Var.f48517w;
                h5Var.d = true;
                r9 r9Var = h5Var.f48473c;
                if (r9Var.f3603w) {
                    f1Var.b(r9Var);
                }
                r9Var.f3603w = false;
                r9Var.f3605x = null;
                if (!r9Var.f3563b0) {
                    ArrayList arrayList = f1Var.f2684b;
                    if (!r9Var.f3600u && storyItem.media != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            r9 r9Var2 = (r9) obj;
                            if (r9Var2.f3574g && r9Var2.f3572f == storyItem.f17435id) {
                                arrayList2.add(r9Var2);
                            }
                        }
                        f1Var.c(arrayList2);
                        f1Var.e(r9Var);
                        r9Var.f3562b = Utilities.random.nextLong();
                        bi.e1 e1Var = new bi.e1(r9Var);
                        r9Var.f3574g = true;
                        e1Var.G = true;
                        long j3 = this.f48415b;
                        r9Var.e = j3;
                        e1Var.I = j3;
                        int i11 = storyItem.f17435id;
                        r9Var.f3572f = i11;
                        e1Var.H = i11;
                        long j10 = storyItem.expire_date * 1000;
                        r9Var.J = j10;
                        e1Var.L = j10;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j11 = document.f17201id;
                            r9Var.H = j11;
                            e1Var.J = j11;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j12 = photo.f17219id;
                                r9Var.I = j12;
                                e1Var.K = j12;
                            }
                        }
                        arrayList.remove(r9Var);
                        arrayList.add(0, r9Var);
                        f1Var.a(e1Var);
                    }
                }
                if (!h5Var.f48472b) {
                    i5Var.R = false;
                    i5Var.S = null;
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) this.d;
                long j13 = this.f48415b;
                MessagesStorage messagesStorage = ((v5) this.f48416c).f48990b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String join = TextUtils.join(", ", arrayList3);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j13 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 2:
                ((v5) this.f48416c).l(this.f48415b, (TL_stories.StoryItem) this.d);
                return;
            default:
                z5 z5Var = (z5) this.f48416c;
                z5Var.getClass();
                ((View) this.d).invalidate();
                MessagesController.getInstance(z5Var.f49150a).getStoriesController().e0(this.f48415b, false);
                return;
        }
    }

    public f5(Object obj, Object obj2, long j3, int i10) {
        this.f48414a = i10;
        this.f48416c = obj;
        this.d = obj2;
        this.f48415b = j3;
    }
}
