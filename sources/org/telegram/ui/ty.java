package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class ty extends org.telegram.ui.ActionBar.j {
    public final zy f38613a;

    public ty(zy zyVar) {
        this.f38613a = zyVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        zy zyVar = this.f38613a;
        int i12 = zyVar.f40899w;
        ArrayList arrayList = zyVar.e;
        int i13 = zyVar.f40900x;
        if (i10 == -1) {
            if (zyVar.f40901y == null) {
                zyVar.Y();
            } else {
                zyVar.finishFragment();
            }
        } else if (i10 == 1 && zyVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            zyVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = zyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.p2) zyVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(zyVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(zyVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(zyVar.getParentActivity(), appWidgetManager, i13);
            }
            c1 c1Var = zyVar.f40901y;
            if (c1Var != null) {
                int i15 = c1Var.f32974a;
                Object obj = c1Var.f32975b;
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
            zyVar.Y();
        }
    }
}
