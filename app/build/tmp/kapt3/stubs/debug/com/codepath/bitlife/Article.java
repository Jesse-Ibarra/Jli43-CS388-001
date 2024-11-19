package com.codepath.bitlife;

@kotlinx.serialization.Serializable
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000223BY\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010B3\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J?\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001J!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u00c7\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00064"}, d2 = {"Lcom/codepath/bitlife/Article;", "Ljava/io/Serializable;", "seen1", "", "abstract", "", "byline", "Lcom/codepath/bitlife/Byline;", "headline", "Lcom/codepath/bitlife/Headline;", "multimedia", "", "Lcom/codepath/bitlife/MultiMedia;", "mediaImageUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/codepath/bitlife/Byline;Lcom/codepath/bitlife/Headline;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/codepath/bitlife/Byline;Lcom/codepath/bitlife/Headline;Ljava/util/List;)V", "getAbstract$annotations", "()V", "getAbstract", "()Ljava/lang/String;", "getByline$annotations", "getByline", "()Lcom/codepath/bitlife/Byline;", "getHeadline$annotations", "getHeadline", "()Lcom/codepath/bitlife/Headline;", "getMediaImageUrl", "getMultimedia$annotations", "getMultimedia", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
@android.support.annotation.Keep
public final class Article implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable
    private final com.codepath.bitlife.Byline byline = null;
    @org.jetbrains.annotations.Nullable
    private final com.codepath.bitlife.Headline headline = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.codepath.bitlife.MultiMedia> multimedia = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String mediaImageUrl = null;
    @org.jetbrains.annotations.NotNull
    public static final com.codepath.bitlife.Article.Companion Companion = null;
    
    public Article(@org.jetbrains.annotations.Nullable
    java.lang.String p0_866449425, @org.jetbrains.annotations.Nullable
    com.codepath.bitlife.Byline byline, @org.jetbrains.annotations.Nullable
    com.codepath.bitlife.Headline headline, @org.jetbrains.annotations.Nullable
    java.util.List<com.codepath.bitlife.MultiMedia> multimedia) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAbstract() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "abstract")
    @java.lang.Deprecated
    public static void getAbstract$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.codepath.bitlife.Byline getByline() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "byline")
    @java.lang.Deprecated
    public static void getByline$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.codepath.bitlife.Headline getHeadline() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "headline")
    @java.lang.Deprecated
    public static void getHeadline$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.codepath.bitlife.MultiMedia> getMultimedia() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "multimedia")
    @java.lang.Deprecated
    public static void getMultimedia$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMediaImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.codepath.bitlife.Byline component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.codepath.bitlife.Headline component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.codepath.bitlife.MultiMedia> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.codepath.bitlife.Article copy(@org.jetbrains.annotations.Nullable
    java.lang.String p0_866449425, @org.jetbrains.annotations.Nullable
    com.codepath.bitlife.Byline byline, @org.jetbrains.annotations.Nullable
    com.codepath.bitlife.Headline headline, @org.jetbrains.annotations.Nullable
    java.util.List<com.codepath.bitlife.MultiMedia> multimedia) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    com.codepath.bitlife.Article self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/codepath/bitlife/Article.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/codepath/bitlife/Article;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.codepath.bitlife.Article> {
        @org.jetbrains.annotations.NotNull
        public static final com.codepath.bitlife.Article.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public com.codepath.bitlife.Article deserialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override
        public void serialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
        com.codepath.bitlife.Article value) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/codepath/bitlife/Article$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/codepath/bitlife/Article;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<com.codepath.bitlife.Article> serializer() {
            return null;
        }
    }
}