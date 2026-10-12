package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.MessagesStorage;
public final class yy extends org.telegram.ui.ActionBar.j {
    public final ez f44574a;

    public yy(ez ezVar) {
        this.f44574a = ezVar;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ez ezVar = this.f44574a;
        int i12 = ezVar.f37578w;
        ArrayList arrayList = ezVar.f37573e;
        int i13 = ezVar.f37579x;
        if (i10 == -1) {
            if (ezVar.f37580y == null) {
                ezVar.Y();
            } else {
                ezVar.finishFragment();
            }
        } else if (i10 == 1 && ezVar.getParentActivity() != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList2 = new ArrayList<>();
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
            }
            ezVar.getMessagesStorage().putWidgetDialogs(i13, arrayList2);
            SharedPreferences.Editor edit = ezVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
            i11 = ((org.telegram.ui.ActionBar.m2) ezVar).currentAccount;
            edit.putInt("account" + i13, i11);
            edit.putInt("type" + i13, i12);
            edit.commit();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(ezVar.getParentActivity());
            if (i12 == 0) {
                ChatsWidgetProvider.updateWidget(ezVar.getParentActivity(), appWidgetManager, i13);
            } else {
                ContactsWidgetProvider.updateWidget(ezVar.getParentActivity(), appWidgetManager, i13);
            }
            z0 z0Var = ezVar.f37580y;
            if (z0Var != null) {
                int i15 = z0Var.f44585a;
                Object obj = z0Var.f44586b;
                switch (i15) {
                    case 25:
                        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj;
                        int i16 = ChatsWidgetConfigActivity.F;
                        Intent intent = new Intent();
                        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                        chatsWidgetConfigActivity.setResult(-1, intent);
                        chatsWidgetConfigActivity.finish();
                        return;
                    default:
                        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj;
                        int i17 = ContactsWidgetConfigActivity.F;
                        Intent intent2 = new Intent();
                        intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                        contactsWidgetConfigActivity.setResult(-1, intent2);
                        contactsWidgetConfigActivity.finish();
                        return;
                }
            }
            ezVar.Y();
        }
    }
}
