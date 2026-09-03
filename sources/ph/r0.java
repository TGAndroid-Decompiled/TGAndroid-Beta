package ph;

import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.NativeByteBuffer;
public final class r0 implements Runnable {
    public final int f42264a;
    public final MessagesStorage f42265b;
    public final s0 f42266c;

    public r0(MessagesStorage messagesStorage, s0 s0Var, int i10) {
        this.f42264a = i10;
        this.f42265b = messagesStorage;
        this.f42266c = s0Var;
    }

    @Override
    public final void run() {
        SQLiteDatabase database;
        SQLiteDatabase database2;
        switch (this.f42264a) {
            case 0:
                MessagesStorage messagesStorage = this.f42265b;
                s0 s0Var = this.f42266c;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        database = messagesStorage.getDatabase();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                if (database != null) {
                    sQLitePreparedStatement = database.executeFast("REPLACE INTO story_drafts VALUES (?, ?, ?, ?)");
                    sQLitePreparedStatement.requery();
                    int i10 = 1;
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(true);
                    s0Var.b(nativeByteBuffer);
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(nativeByteBuffer.length());
                    s0Var.b(nativeByteBuffer2);
                    sQLitePreparedStatement.bindLong(1, s0Var.f42298a);
                    sQLitePreparedStatement.bindLong(2, s0Var.f42300b);
                    sQLitePreparedStatement.bindByteBuffer(3, nativeByteBuffer2);
                    if (!s0Var.G) {
                        if (s0Var.M) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                    }
                    sQLitePreparedStatement.bindInteger(4, i10);
                    sQLitePreparedStatement.step();
                    nativeByteBuffer2.reuse();
                    sQLitePreparedStatement.dispose();
                    sQLitePreparedStatement.dispose();
                    return;
                }
                return;
            default:
                MessagesStorage messagesStorage2 = this.f42265b;
                s0 s0Var2 = this.f42266c;
                SQLitePreparedStatement sQLitePreparedStatement2 = null;
                try {
                    try {
                        database2 = messagesStorage2.getDatabase();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    if (database2 != null) {
                        sQLitePreparedStatement2 = database2.executeFast("INSERT INTO story_drafts VALUES (?, ?, ?, ?)");
                        sQLitePreparedStatement2.requery();
                        int i11 = 1;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(true);
                        s0Var2.b(nativeByteBuffer3);
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(nativeByteBuffer3.length());
                        s0Var2.b(nativeByteBuffer4);
                        sQLitePreparedStatement2.bindLong(1, s0Var2.f42298a);
                        sQLitePreparedStatement2.bindLong(2, s0Var2.f42300b);
                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer4);
                        if (!s0Var2.G) {
                            if (s0Var2.M) {
                                i11 = 2;
                            } else {
                                i11 = 0;
                            }
                        }
                        sQLitePreparedStatement2.bindInteger(4, i11);
                        sQLitePreparedStatement2.step();
                        nativeByteBuffer4.reuse();
                        sQLitePreparedStatement2.dispose();
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th3;
                }
        }
    }
}
