package r3;

import b8.te;
import b8.xb;
import d2.s0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class a extends te {
    public static final Pattern f54234c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder f54235a = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder f54236b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override
    public final s0 b(n3.a aVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f54236b;
        CharsetDecoder charsetDecoder2 = this.f54235a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new s0(new c(bArr, null, null));
        }
        Matcher matcher = f54234c.matcher(str);
        String str3 = null;
        for (int i3 = 0; matcher.find(i3); i3 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String c2 = xb.c(group);
                c2.getClass();
                if (!c2.equals("streamurl")) {
                    if (c2.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new s0(new c(bArr, str2, str3));
    }
}
