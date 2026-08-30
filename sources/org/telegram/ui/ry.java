package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class ry extends org.telegram.ui.ActionBar.j {
    public final xy f38141a;

    public ry(xy xyVar) {
        this.f38141a = xyVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        xy xyVar = this.f38141a;
        int i12 = xyVar.f40333w;
        ArrayList arrayList = xyVar.e;
        int i13 = xyVar.f40334x;
        if (i10 == -1) {
            if (xyVar.f40335y == null) {
                xyVar.Y();
            } else {
                xyVar.finishFragment();
            }
        } else if (i10 == 1 && xyVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            xyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = xyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.p2) xyVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(xyVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(xyVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(xyVar.getParentActivity(), appWidgetManager, i13);
            }
            a1 a1Var = xyVar.f40335y;
            if (a1Var != null) {
                int i15 = a1Var.f32427a;
                Object obj = a1Var.f32428b;
                switch (i15) {
                    case 25:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.C;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.B);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.C;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.B);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            xyVar.Y();
        }
    }
}
